package com.groot.abc;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SecondServlet extends GenericServlet{
	static {
		System.out.println("GrootLog: SecondServlet static block");
	}
	{
		System.out.println("GrootLog: SecondServlet instance initialzer block");	
	}
	public SecondServlet(){
		System.out.println("GrootLog: SecondServlet non args constructor");
	}
	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
		
	}

}
