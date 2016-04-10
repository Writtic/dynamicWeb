package controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DoOrder
 */
@WebServlet("/DoOrder")
public class DoOrder extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoOrder() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String itemnum = request.getParameter("itemnum");
		String discription = request.getParameter("description");
		String price = request.getParameter("price");
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String midname = request.getParameter("midname");
		String address = request.getParameter("address");
		String card = request.getParameter("card");
		String cardnum = request.getParameter("cardnum");
		String recardnum = request.getParameter("recardnum");
		PrintWriter out = response.getWriter();

		String htmlResponse = "<html><body bgcolor='FDF5E6'>" 
				+ "<h1 align='center'>Reading All Request Parameters</h1><br/>"
				+ "<table border='1' align='center'>"
					+ "<tr bgcolor='FFAD00'><th>Parameter Name</th>"
						+ "<th>Parameter Value(s)</th></tr>"
					+ "<tr><td>cardNum</td>"
						+ "<td><ul><li>" + cardnum + "</li><li>" + recardnum +"</li></td>"
					+ "</tr>"
					+ "<tr><td>cardType</td>"
						+ "<td>" + card + "</td></tr>"
					+ "<tr><td>price</td>"
						+ "<td>" + price + "</td></tr>"
					+ "<tr><td>initial</td>"
						+ "<td>" + midname + "</td></tr>"
					+ "<tr><td>itemNum</td>"
						+ "<td>" + itemnum + "</td></tr>"
					+ "<tr><td>address</td>"
						+ "<td>" + address + "</td></tr>"
					+ "<tr><td>firstName</td>"
						+ "<td>" + firstname + "</td></tr>"
					+ "<tr><td>description</td>"
						+ "<td>" + discription + "</td></tr>"
					+ "<tr><td>lastName</td>"
						+ "<td>" + lastname + "</td></tr>"
				+ "</table></body></html>";
		out.println(htmlResponse);
	}

}
