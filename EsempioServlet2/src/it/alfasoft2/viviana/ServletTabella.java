package it.alfasoft2.viviana;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletTabella
 */
@WebServlet("/ServletTabella")
public class ServletTabella extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		String str="<table>"+"<th> a </th>"+" <th> b </th>"+"<tr>"+"<td> 1 </td>"+"<td> 2 </td>"+"</tr>"+"<tr>"+"<td> 3 </td>"+"<td> 4 </td>"+"</tr>"+"</table>";
		
		PrintWriter wr=response.getWriter();
		wr.println("tabella "+str);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
