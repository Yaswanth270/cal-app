package com.practice.calci;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SubractionServerlet extends GenericServlet{

	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		String n1 = req.getParameter("num1");
	    int a = Integer.parseInt(n1);
	    
	    int b = Integer.parseInt(req.getParameter("num2"));
	    
	    int sub = a-b;
	    
	    PrintWriter out = res.getWriter();
	    out.print("<h1> THE SUBRACTION FOR TWO NUMBERS IS "+sub+" </h1>");
		
	}

}
