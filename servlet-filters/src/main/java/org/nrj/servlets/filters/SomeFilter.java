package org.nrj.servlets.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter("/myapp")
public class SomeFilter implements Filter{
	
	public void init(FilterConfig filterConfig) throws ServletException {}

	public void destroy() {}
	
	
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		
		System.out.println("Filter Called");
		
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) res;
		
		if(request.getParameter("name").trim().equalsIgnoreCase("admin")) {
			response.getWriter().print("Admin cannot greet themself...!!");
			
		}
		else {
			chain.doFilter(req, res);		
		}
		
	}

}
