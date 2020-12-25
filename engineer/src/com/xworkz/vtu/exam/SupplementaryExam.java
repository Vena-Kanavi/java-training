package com.xworkz.vtu.exam;

public class SupplementaryExam extends Exam{
	
      public static String university="VTU Belgaum";
      
      public SupplementaryExam() {
    	  super("2ka16cs",1500);               //constructor chaining
    	  System.out.println("invoked default constructor");
      }
      
      public SupplementaryExam(String name) {
    	  super();
    	  System.out.println("calling overloaded constructor");
      }
      
      @Override
      public boolean allow(HallTicket hallTicket) {
    	  System.out.println("invoked allow from supplementary");
		return super.allow(hallTicket);
    	  
      }
      
      
      public static String getUniversity() {
		return university;
	}
}
