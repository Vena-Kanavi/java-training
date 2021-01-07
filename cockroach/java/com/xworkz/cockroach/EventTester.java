package com.xworkz.cockroach;

import com.xworkz.cockroach.event.ExceptionEvent;

public class EventTester {

	public static void main(String[] args) throws Throwable {
		
		ExceptionEvent event=new ExceptionEvent();
		
		event.exceptionEvent(false);
	}
}
