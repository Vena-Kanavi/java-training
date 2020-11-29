package com.xworkz.constructor.examples;

public class Bike {
		public String color;

	public Bike(String bikeColor)
	{
		System.out.println("Invoked Bike constructor");
		System.out.println("argument value befor::" +color);
		color=bikeColor;
		System.out.println("argument value after::" +bikeColor);
	}
	}


