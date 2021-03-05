package com.xworkz.biscuits.exception;

public class BiscuitSFCreationException extends RuntimeException{

	public BiscuitSFCreationException() {
		System.out.println("created BiscuitSFCreationException");
	}
	
	public BiscuitSFCreationException(String msg){
		super(msg);
	}
	
}
