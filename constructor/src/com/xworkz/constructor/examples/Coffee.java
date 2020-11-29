package com.xworkz.constructor.examples;

public class Coffee {
		public int price=284;
		public int grams=100;
		public String coffeePowerderName="BRU";
	public Coffee(int coffeePrice,int coffeeInGrams,String name)
	{
		System.out.println("Invoked Coffie Constructor");
		System.out.println("argument 1::"+price);
		System.out.println("arument 2::"+grams +"grams");
		System.out.println("argument 2::"+coffeePowerderName);
		price=coffeePrice;
		grams=coffeeInGrams;
		coffeePowerderName=name;
		System.out.println("argument 1 value After::" +coffeePrice);
		System.out.println("argument 2 value After::" +coffeeInGrams  +"grams");
		System.out.println("argument 3 value After::" +name);
		
	}

	}

