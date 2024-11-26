package com.groot.abc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyProccessServlet extends HttpServlet{
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
				resp.setContentType("text/html");
				String name=req.getParameter("name");
				String password=req.getParameter("password");
				PrintWriter out=resp.getWriter();
				try {
					//com.mysql.cj.jdbc.Driver
					Class.forName("com.mysql.cj.jdbc.Driver");
					out.print("Class loaded");
					Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/org","root","root");
					out.print("Class connected");
					PreparedStatement ps=conn.prepareStatement("select * from student where name=? and password=?");
					ps.setString(1, name);
					ps.setString(2, password);
					ResultSet rs= ps.executeQuery();
					if(rs.next()) {
						out.print("result found");
						resp.sendRedirect("/welcome");
						
					}else {
						out.print("<font color='red'>User Name password is incorrect</font>");
						req.getRequestDispatcher("index.html").include(req, resp);
					}
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}catch (SQLException e) {
					// TODO: handle exception
				}
				out.print("after exception");
				
				
		}
}
