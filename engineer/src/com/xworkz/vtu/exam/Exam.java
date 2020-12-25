package com.xworkz.vtu.exam;

public class Exam {
	
	private String code;
	private double fees;
	private HallTicket hallTicket;
    public static String university="VTU";
    
    
    /**
	 * @param code
	 * @param fees
	 */
	public Exam(String code, double fees) {
		super();
		this.code = code;
		this.fees = fees;
	}


	/**
	 * default constructor
	 */
	public Exam() {
		System.out.println("invoked default constructor");
	}


	public boolean allow(HallTicket hallTicket) {
    	
    	boolean there=false;
    	if(this.fees>=1000) {
    		there=true;
    		System.out.println("fees paid");
    		if (hallTicket != null) {
				there = true;
				this.hallTicket = hallTicket;
				this.hallTicket.displayDetails();
				System.out.println("EXAM CODE : " + this.code);
    		
    	}else {
    	     System.out.println("No hall ticket");	
    	}
    	
    	}
    		else {
    		System.out.println("fees is less");
    	}
    	  return there;
    }
	
	public static String getUniversity() {
		return university;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	
   
}
