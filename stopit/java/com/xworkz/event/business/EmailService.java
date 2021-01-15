package com.xworkz.event.business;

import com.xworkz.event.exceptions.EmailLimitException;

public class EmailService {
	private int emailLimit = 3;
	private String[] emails = new String[this.emailLimit];
	private int index = 0;

	public EmailService() {
		System.out.println("invoked email service");
	}

	public void addemail(String email) {
		System.out.println("invoked add email");
		System.out.println("arg "+email);
		if (this.index < this.emails.length) {
			emails[this.index] = email;
			this.index++;
		} else {
			throw new EmailLimitException("Max Email limit reached,limit is " + this.emailLimit);
		}
	}

	public void setEmailLimit(int emailLimit) {
		this.emailLimit = emailLimit;
	}

	public int getEmailLimit() {
		return emailLimit;
	}
}
