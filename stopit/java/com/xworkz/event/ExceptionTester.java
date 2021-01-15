package com.xworkz.event;

import com.xworkz.event.business.Display;
import com.xworkz.event.exceptions.EmailValidationException;

public class ExceptionTester {

	public static void main(String[] args) {
		Display display = new Display();

		try {
			display.printEmail("contact@x-workz.in");
		} catch (EmailValidationException e) {
			e.printStackTrace();
		}
	}

}
