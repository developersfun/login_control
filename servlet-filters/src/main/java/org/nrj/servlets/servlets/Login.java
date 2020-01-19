package org.nrj.servlets.servlets;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.nrj.servlets.conf.HibernateConfig;
import org.nrj.servlets.entities.User;
import org.nrj.servlets.util.UsersUtil;

@WebServlet("/Login")
public class Login extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2771394128781529067L;

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uname = req.getParameter("uname");
		String pass = req.getParameter("pass");
		/*
		 * try { pass = UsersUtil.getPasswordHash(req.getParameter("pass").trim()); }
		 * catch (NoSuchAlgorithmException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */
		
		System.out.println("Username : " + uname);
		System.out.println("Password : " + pass);
		
		 Session session = HibernateConfig.getSessionFactory().openSession();
		 session.beginTransaction();
		    
		Criteria cr = session.createCriteria(User.class);
		cr.add(Restrictions.eq("username", uname));
		cr.add(Restrictions.eq("password", pass));
		List results = cr.list();
		
		if(null!=results && !results.isEmpty() && results.size()>0) {
			User us = (User) results.get(0);
			
			HttpSession httpSession = req.getSession();
			httpSession.setAttribute("uname", us.username);
			
			resp.sendRedirect("home.jsp");
		}else {
			resp.sendRedirect("login.jsp");
		}
	}
}
