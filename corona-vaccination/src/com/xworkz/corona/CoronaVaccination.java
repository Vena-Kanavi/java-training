package com.xworkz.corona;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CoronaVaccination extends HttpServlet{
	
	public CoronaVaccination() {
		System.out.println("created "+this.getClass().getSimpleName());
		}
		
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		  String name=req.getParameter("name");
		  String age=req.getParameter("age");
		  String adharNumber=req.getParameter("adharNumber");
		  String place=req.getParameter("place");
		  String address=req.getParameter("address");
		  String phoneNo=req.getParameter("phoneNo");
		  String noOfFamily=req.getParameter("noOfFamily");
		  String gender=req.getParameter("gender");
		  String disease=req.getParameter("disease");
		  String companyPrefered=req.getParameter("companyPrefered");
		  String citizen=req.getParameter("citizen");
		  String dateOfBirth=req.getParameter("date");
		  String country=req.getParameter("country");
		  System.out.println(name);
		  System.out.println(age);
		  System.out.println(adharNumber);
		  System.out.println(place);
		  System.out.println(address);
		  System.out.println(phoneNo);
		  System.out.println(noOfFamily);
		  System.out.println(gender);
		  System.out.println(disease);
		  System.out.println(companyPrefered);
		  System.out.println(citizen);
		  System.out.println(dateOfBirth);
		  System.out.println(country);
		  
		  resp.setContentType("text/html");
		  
		  PrintWriter writer=resp.getWriter();
		  writer.println("<html>");
		  writer.println("<body>");
		  writer.println("<h1>");
		  writer.println("Corona Vaccination Order");
		  writer.println("</h1>");
		  writer.println("<b>");
		  writer.println("Corona Vaccination order is confirmed for patient "+name+" ");
		  writer.println("</b>");
		  writer.println("</body>");
		  writer.println("</html>");	
		}
		
	

}
