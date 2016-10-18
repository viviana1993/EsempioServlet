package it.alfasoft2.viviana;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class EsempioServ2
 */
@WebServlet(urlPatterns={"/aaaaa"}) //per rinominare indirizzo
public class EsempioServ2 extends HttpServlet {
	private static final long serialVersionUID = 1L;



	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String username=request.getParameter("username");
		String password=request.getParameter("password");


		if(password.equals("123")){//se la pass è giusta allora mando messaggio

			RequestDispatcher rd=request.getRequestDispatcher("servlet3");
			rd.include(request,response);
			PrintWriter wr=response.getWriter();
			wr.println("registrazione corretta ");
			//response.sendRedirect("benvenuto.html");
		}else{
			//se  è sbagliata rimando alla pagina login
			//response.sendRedirect("login.html");//se la pass è sbagliata allora devo rifare il login
			RequestDispatcher rd2=request.getRequestDispatcher("login.html");
			PrintWriter wr=response.getWriter();
			wr.println("username o password sono errati");
			
			rd2.include(request, response);
			
			
		}
	}




}
