package com.xworkz.servlet.hibernate;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.servlet.dao.ContactDAO;
import com.xworkz.servlet.dao.ContactDAOImpl;
import com.xworkz.servlet.entity.ContactEntity;
import com.xworkz.servlet.service.ContactService;
import com.xworkz.servlet.service.ContactServiceImpl;

public class ContactUs extends HttpServlet{

	private ContactService< ContactEntity> service;
	
	
	public ContactUs() {
	System.out.println("created "+this.getClass().getSimpleName());
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		ContactDAO dao=new ContactDAOImpl();
		service=new ContactServiceImpl(dao);
	}
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	System.out.println("overridden doget");
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String reqForName=req.getParameter("name");
	String reqForPhone=req.getParameter("phone");
	String reqForCompany=req.getParameter("company");
	String reqForEmail=req.getParameter("email");
	String reqForTell=req.getParameter("tellme");
	System.out.println(reqForName);
	System.out.println(reqForPhone);
	System.out.println(reqForCompany);
	System.out.println(reqForEmail);
	System.out.println(reqForTell);
	
	ContactEntity entity=new ContactEntity();
	entity.setName(reqForName);
	entity.setPhone(reqForPhone);
	entity.setCompany(reqForCompany);
	entity.setEmail(reqForEmail);
	entity.setAbout(reqForTell);
	
	
	resp.setContentType("text/html");
	PrintWriter writer=resp.getWriter();
	writer.println("<html>");
	writer.println("<body>");
	writer.println("<h1>");
	writer.println("contact form submited");
	writer.println("</h1>");
	writer.println("<h3>");
	ContactService<ContactEntity> rep=service;
	
	   boolean valid=rep.validateAndSave(entity);
		if(valid) {
			System.out.println("data saved");
			writer.println("contact for "+reqForName);
		}else {
			System.out.println("data is not saved");
		}
		
	writer.println("</h3>");
	writer.println("<a href='index.html'>add one more contact</a>");
	writer.println("</body>");
	writer.println("</html>");
	
	
	
	
	}
}
