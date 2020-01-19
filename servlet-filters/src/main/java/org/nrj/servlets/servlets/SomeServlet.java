package org.nrj.servlets.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/some")
public class SomeServlet extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter w = resp.getWriter();
		/*
		 * w.println("<html><body>"); w.println("<h1>");
		 * w.println("Lucky to be redirected...!!"); w.println("</h2>");
		 * w.println("</body></html>");
		 */
		
	}
}
