package Controller;

import java.io.IOException;

import java.util.List;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import Bank.dao.BankCrud;
import Bank.dto.Bank;

@SuppressWarnings("serial")
@WebServlet("/edit")
public class UpdateEdit extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		int id = Integer.parseInt(req.getParameter("id"));
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
		bank.setId(id);
		
		Bank dbbank = crud.update(bank);
		if(dbbank != null) {
			List<Bank> list = crud.fetchAll();
			req.setAttribute("list", list);
			RequestDispatcher dispatcher = req.getRequestDispatcher("display.jsp");
			dispatcher.forward(req, res);
		}
		else {
			RequestDispatcher dispatcher = req.getRequestDispatcher("login.jsp");
			dispatcher.include(req, res);
		}
	}
}
