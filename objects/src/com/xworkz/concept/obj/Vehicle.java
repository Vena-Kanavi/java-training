package com.xworkz.concept.obj;

public class Vehicle {
	
	public String model;
	public String color;
	public String owner;
	public static String yom;
	
	public void displayInfo()
	{
		System.out.println("invoked displayInfo");
		System.out.println(model);
		System.out.println(color);
		System.out.println(owner);
		System.out.println(yom);
	}
	

}