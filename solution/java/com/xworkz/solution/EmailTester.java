package com.xworkz.solution;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class EmailTester {

	public static void main(String[] args) {
		Collection<String> emails = new ArrayList();
		emails.add("vena.xworkz@gmail.com");
		emails.add("venakanavi1998@gmail.com");
		emails.add("pramodkanavi1998@gmail.com");
		emails.add("contact@xworkz.in");
		emails.add("cfkanavi@gmail.com");
		emails.add("contact@xworkz.in");
		emails.add("vishala@gmail.com");
		emails.add("aishwarya@gmail.com");

		System.out.println("emails before removing duplicates "+emails);
		int totalNo = emails.size();
		System.out.println("Total number of emails " + totalNo);
		

		Collection<String> tempEmails = new ArrayList();
		
		Iterator<String> iterator = emails.iterator();
		while (iterator.hasNext()) {
			
			String str = iterator.next();
			if (tempEmails.contains(str)) {
				iterator.remove();
			} else {
				tempEmails.add(str);
			}

		}
		System.out.println("emails after removing duplicates " + tempEmails);
		System.out.println(tempEmails.size());
	}

}
