package org.nrj.servlets.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/myapp")
public class MyAppServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 104420438721591515L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession();
		
        Date result = new Date(session.getLastAccessedTime()); 
		
		out.print("Hello, " + name + "!! Your last login was on : " + result);
		
		
		
	}
	
}
