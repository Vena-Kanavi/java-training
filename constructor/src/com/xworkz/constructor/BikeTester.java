package com.xworkz.constructor;
import com.xworkz.constructor.examples.Bike;

	public class BikeTester {

		public static void main(String[] args) {
			Bike bike=new Bike("blue");
			System.out.println(bike.color);
			Bike bike1=new Bike("black") ;
			System.out.println(bike1.color);
		

		}

	}


