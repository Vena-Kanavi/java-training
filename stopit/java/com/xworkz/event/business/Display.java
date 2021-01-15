package com.xworkz.event.business;

import com.xworkz.event.exceptions.EmailValidationException;

public class Display {
		public void printEmail(String email) throws EmailValidationException {
			if (email != null) {
				if (email.contains("@") &&
						(email.contains(".com")|| email.contains(".in"))) {
					System.out.println("valid email");
					System.out.println(email);
				}
				else {
					throw new EmailValidationException("email should containt @ and .com or .in");
				}
			}
		}

	}

