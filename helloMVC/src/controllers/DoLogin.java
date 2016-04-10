package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Customer;
import util.CustomerMap;

/**
 * Servlet implementation class DoLogin
 */
@WebServlet("/DoLogin")
public class DoLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String customerId = request.getParameter("customerId");
		String customerPw = request.getParameter("customerPw");
		// Perform business logic. return a bean as a result
		// 3명의 소비자를 가진 맵을 생성 
		CustomerMap service = new CustomerMap();
		Customer customer = service.findCustomer(customerId);
		int check = service.checkCustomer(customer, customerPw);
		String page = null;
		
		if(check == 0) {
			request.setAttribute("badid", customerId);
			page = "/jsps/error.jsp";
		} else if(check == -1) { 
			page = "/jsps/error.jsp";
		} else {
			request.setAttribute("customer", customer);
			page = "/jsps/form.jsp";
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(page);
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
