package com.groot.abc;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ProcessServlet implements Servlet {

	public ProcessServlet() {
		System.out.println("GrootLog: ProcessServlet Constructor called");
	}

	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("In to the init method");
		System.out.println("GrootLog: ProcessServlet init method called");

	}

	{
		System.out.println("I am into the instace initialzer block");
		System.out.println(" GrootLog: ProcessServlet I am instance initilazer blok");
	}
	static {
		System.out.println("GrootLog: ProcessServlet  in the static block");
		System.out.println("GrootLog: ProcessServlet I am static block");
	}

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("GrootLog: ProcessServlet into the service method");
		PrintWriter out=response.getWriter(); 
		response.setContentType("text/html");
//		Enumeration<String> en= request.getParameterNames();
//		while(en.hasMoreElements()) {
//			out.print(en.nextElement()+"<br>");
//		}
		String name=request.getParameter("n1");
		String email=request.getParameter("e1");
		out.print("Name : "+name);
		out.print("Email : "+email);
	}

	public void destroy() {
		// TODO Auto-generated method stub

	}

	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

}
