package Bank.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import Bank.dto.Bank;

public class BankCrud {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("upendra");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();

	public void save(Bank bank) throws Exception {
		
		et.begin();
		em.persist(bank);
		et.commit();
		
	}
	
	@SuppressWarnings("unused")
	public Bank update(Bank bank) {
		Bank stu = em.find(Bank.class, bank.getId());
		stu.setFirstName(bank.getFirstName());
//		stu.setEmail(student.getEmail());
//		stu.setPhone(student.getPhone());
//		stu.setPwd(student.getPwd());
//		System.out.println(stu);
		if(bank!=null) {
			et.begin();
			em.merge(bank);
			et.commit();
		}
		else {
			System.out.println("Id is not exist");
		}
		return bank;
	}	

	public Bank fetchId(int id) {
		Bank bank = em.find(Bank.class, id);
		if(bank != null) {
			return bank;
		}
		else {
			return null;
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<Bank> fetchAll() {
	    Query q = em.createQuery("select a from Bank a");
	    return  q.getResultList();
	    
	}

	public Bank fetchByAccountNo(long accountNo) throws Exception {
		Query q = em.createQuery("select a from Bank a where a.accountNo = : accountNo");
		q.setParameter("accountNo", accountNo);
		Bank bank =(Bank) q.getSingleResult();
		return bank;
	}
	
}
