package com.xworkz.vtu.exam;

public class HallTicket {
     private String ticketNo;
     private int noOfSub;
     private String studentName;
	/**
	 * @param ticketNo
	 * @param noOfSub
	 * @param studentName
	 */
	public HallTicket(String ticketNo, int noOfSub, String studentName) {
		super();
		this.ticketNo = ticketNo;
		this.noOfSub = noOfSub;
		this.studentName = studentName;
	}
     /**
      * Display details method is to display the details of hall-ticket
      */
     public void displayDetails() {
    	 System.out.println("invoked display details");
    	 System.out.println(ticketNo);
    	 System.out.println(noOfSub);
    	 System.out.println(studentName);
    	 
     }
}
