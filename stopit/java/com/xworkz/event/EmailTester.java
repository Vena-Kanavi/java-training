package com.xworkz.event;

import com.xworkz.event.business.EmailService;

public class EmailTester {

	public static void main(String[] args) {
		EmailService service=new EmailService();
		service.addemail("vena.xworkz@gmail.com");
		service.addemail("vishalaxi.xworkz@gmail.com");
		service.addemail("aishwarya.xworkz@gmail.com");
		try {
		service.addemail("contact@xworkz.in");
		}
		catch(Exception e){
		    System.err.println("limit crossed");
		}
		finally {
		 System.out.println("always executes this block");	
		}
	}

}
