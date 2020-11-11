package com.xworkz.demo_example;

public class CreditCardEstimater {
	private static double limit=1000;
	public static void expenditure(double amount) {
		System.out.println("total amount in credit card is "+limit);
		if(amount<limit) {
		System.out.println("total expenditure is "+amount);
		amount=limit-amount;
		System.out.println("remaining amount is "+amount);
	}
		else {
			System.out.println("expenditure must be less than limit");
		}
	}
	
}
