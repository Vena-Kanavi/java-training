package com.xworkz.demo_example;

	public class PocketMoneyEstimator{
		private static double totalamount;
		public static void request(double amount,String day) {
			System.out.println("arg1 is "+amount);
			System.out.println("arg2 is "+day);
			totalamount=totalamount+amount;
			System.out.println("total amount is "+totalamount);
		}
		public static void expenditure(double amount) {
			System.out.println("spent amount "+amount);
			totalamount=totalamount-amount;
			System.out.println("Total amount remaining "+totalamount);
		}
	}

