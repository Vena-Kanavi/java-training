package com.xworkz.exception;
import com.xworkz.exception.event.ExceptionEvent;

public class EventTester {

	public static void main(String[] args) throws Throwable {

		ExceptionEvent event = new ExceptionEvent();

		//event.exceptionEvent(false);
		
		event.frame1();
	}

}
