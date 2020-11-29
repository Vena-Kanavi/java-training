package com.xworkz.constructor.examples;

public class Museum {
		public String museumType="Zoology";
		public String city="Dharwad";
		public int established=1947;

	public Museum(String name,String place,int year)
	{
		System.out.println("Invoked Museum Constructor");
		System.out.println("type of museum ::" +museumType);
		System.out.println("name of place where that museum is present::" +city);
		System.out.println("established year::" +established);
		museumType=name;
		city=place;
		established=year;
		System.out.println("type of museum After::" +name);
		System.out.println("name of place where that museum is present After::" +place);
		System.out.println("established year After::" +year);
	}
		

	}

