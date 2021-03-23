package com.xworkz.servlet.hibernate;

import java.io.IOException;

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

public class SearchByName extends HttpServlet{

	
	private ContactService< ContactEntity> service;
	
	public SearchByName() {
		System.out.println("invoked SearchByName");
	}
	@Override
	public void init(ServletConfig config) throws ServletException {
		ContactDAO dao=new ContactDAOImpl();
		service=new ContactServiceImpl(dao);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
System.out.println("invoked do post");
		String name=req.getParameter("name");
		Object ent=this.service.searchByName(name);
		System.out.println(ent);
	}
}
