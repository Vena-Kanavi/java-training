package com.xworkz.event.exceptions;

public class EmailLimitException extends RuntimeException {
	
	public EmailLimitException() {
		super();
	}
	
	public EmailLimitException(String message) {
		super(message);
	}
	

}
