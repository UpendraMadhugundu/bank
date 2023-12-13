package Controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import Bank.dao.BankCrud;
import Bank.dto.Bank;

@SuppressWarnings("serial")
@WebServlet("/register")
public class Register extends GenericServlet {
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		String firstName = req.getParameter("firstName");
		String lastName = req.getParameter("lastName");
		String accountNo = req.getParameter("accountNo");
		String accountType = req.getParameter("accountType");
		String branchName = req.getParameter("branchName");
		String ifscCode = req.getParameter("ifscCode");
		String phone = req.getParameter("phone");
		String email = req.getParameter("email");
		String dob = req.getParameter("dob");
		String gender = req.getParameter("gender");
		String password = req.getParameter("password");
		String address = req.getParameter("address");
		String area = req.getParameter("area");
		String city = req.getParameter("city");
		String pincode = req.getParameter("pincode");
		String state = req.getParameter("state");
		String country = req.getParameter("country");
		
		BankCrud crud = new BankCrud();
		Bank bank = new Bank(firstName, lastName, Long.parseLong(accountNo), accountType, branchName, Integer.parseInt(ifscCode), Long.parseLong(phone), email, dob, gender, password, address, area, city, Integer.parseInt(pincode), state, country);
		
		try {
			crud.save(bank);
//			res.setContentType("text/html");
//			PrintWriter print = res.getWriter();
//			print.print("Register Successfully");
			RequestDispatcher dispatcher = req.getRequestDispatcher("homepage.jsp");
			dispatcher.forward(req, res);
			
		} catch (Exception e) {
			e.printStackTrace();
			RequestDispatcher dispatcher = req.getRequestDispatcher("register.html");
			dispatcher.include(req, res);
			
		}
		
	}

}
