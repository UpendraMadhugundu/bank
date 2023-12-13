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
@WebServlet("/loginjsp")
public class BankLogin extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		long accountNo = Long.parseLong(req.getParameter("accountNo"));
		String password = req.getParameter("password");
		
		BankCrud crud = new BankCrud();
		try {
			Bank bank = crud.fetchByAccountNo(accountNo);
			if(bank.getPassword().equals(password)) {
				List<Bank> list = crud.fetchAll();
				req.setAttribute("list", list);
				RequestDispatcher dispatcher = req.getRequestDispatcher("display.jsp");
				dispatcher.forward(req, res);
			}
			else {
				req.setAttribute("msg", "Password Incorrect");
				RequestDispatcher dispatcher = req.getRequestDispatcher("login.jsp");
				dispatcher.forward(req, res);
			}
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("msg", "Account Number Incorrect");
			RequestDispatcher dispatcher = req.getRequestDispatcher("login.jsp");
			dispatcher.include(req, res);	
		}
	}
}
