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
@WebServlet("/update")
public class UpdateData extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		
		BankCrud crud = new BankCrud();
		Bank bank = crud.fetchId(id);
		if(bank != null) {
			req.setAttribute("bank", bank);
			RequestDispatcher dispatcher = req.getRequestDispatcher("update.jsp");
			dispatcher.forward(req, res);
		}
		else {
			RequestDispatcher dispatcher = req.getRequestDispatcher("login.jsp");
			dispatcher.include(req, res);
		}
	}
}
