package com.xworkz.sports.computer;

public class Laptop extends Computer{
      private String processor;
      public void connectsToPhone() {
    	  System.out.println("can carry method is invoked");
      }
      public void setProcessor(String processor) {
		this.processor = processor;
	}
      public String getProcessor() {
		return processor;
	}
}
