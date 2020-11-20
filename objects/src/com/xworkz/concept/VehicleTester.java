package com.xworkz.concept;

import com.xworkz.concept.obj.Vehicle;

public class VehicleTester {

	public static void main(String[] args) {
		
				
		Vehicle vehicle=new Vehicle();
		
		vehicle.model="Land Rover";
		vehicle.color="Yellow";
		vehicle.owner="Ratan Tata";
		vehicle.displayInfo();
		
		System.out.println("*************************************");
		
			
		Vehicle vehicle2=new Vehicle();
		vehicle2.model="Nano";
		vehicle2.color="Blue";
		vehicle.owner="Ratan Tata";
		vehicle2.displayInfo();		
	}
}
