package com.xworkz.busticket.book;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BusTicketBooking extends HttpServlet{
	public BusTicketBooking() {
	System.out.println("created "+this.getClass().getSimpleName());
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	  String source=req.getParameter("source");
	  String destination=req.getParameter("destination");
	  String noOfPeople=req.getParameter("noOfPeople");
	  String gender=req.getParameter("gender");
	  String bookedBy=req.getParameter("bookedBy");
	  String email=req.getParameter("email");
	  String phoneNo=req.getParameter("phoneNo");
	  String date=req.getParameter("date");
	  System.out.println(source);
	  System.out.println(destination);
	  System.out.println(noOfPeople);
	  System.out.println(gender);
	  System.out.println(bookedBy);
	  System.out.println(email);
	  System.out.println(phoneNo);
	  System.out.println(date);
	  
	  resp.setContentType("text/html");
	  
	  PrintWriter writer=resp.getWriter();
	  writer.println("<html>");
	  writer.println("<body>");
	  writer.println("<h1>");
	  writer.println("Bus Ticket Booking");
	  writer.println("</h1>");
	  writer.println("<b>");
	  writer.println("Bus Ticket booking confirmed from "+source+" to "+destination+" booked by "+bookedBy);
	  writer.println("</b>");
	  writer.println("</body>");
	  writer.println("</html>");	
	}
	

}
