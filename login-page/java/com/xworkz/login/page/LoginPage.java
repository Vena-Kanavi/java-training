package com.xworkz.login.page;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginPage extends HttpServlet{

	public LoginPage() {
		System.out.println("created "+this.getClass().getSimpleName());
	}
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Overrided doGet");
		String reqForName=req.getParameter("user");
		String reqForPassword=req.getParameter("secret");
		System.out.println(reqForName);
		System.out.println(reqForPassword);
		
		
		resp.setContentType("text/html");
		PrintWriter writer=resp.getWriter();
		writer.println("<html>");
		writer.println("<body>");
		writer.println("<h1>");
		writer.println("login successfull"+reqForName);
		writer.println("</h1>");
		writer.println("</body>");
		writer.println("</html>");
		writer.flush();
		
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Overrided doPost");
		String reqForName=req.getParameter("user");
		String reqForPassword=req.getParameter("secret");
		System.out.println(reqForName);
		System.out.println(reqForPassword);
		
		
		resp.setContentType("text/html");
		PrintWriter writer=resp.getWriter();
		writer.println("<html>");
		writer.println("<body>");
		writer.println("<h1>");
		writer.println("login successfull "+reqForName);
		writer.println("</h1>");
		writer.println("</body>");
		writer.println("</html>");
		writer.flush();
		
	}
}
