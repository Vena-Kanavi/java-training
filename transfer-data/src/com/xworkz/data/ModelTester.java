package com.xworkz.data;

import com.xworkz.data.constants.Variants;
import com.xworkz.data.dto.CarDTO;
import com.xworkz.data.transfer.CarShowRoom;


public class ModelTester {

	public static void main(String[] args) {
		
		/**
		 * creating object for CarShowRoom
		 * adding car and displaying car
		 */
		
		CarShowRoom car=new CarShowRoom("Hondai", "Hubli");
		CarDTO dto=new CarDTO("Baleno", 900000, Variants.TOP);
		car.addCar(dto);
		car.displayCars();
		
		CarDTO dto1=new CarDTO("Ferrari", 350000000, Variants.TOP);
		car.addCar(dto1);
		car.displayCars();
		
		/**
		 * deleting car by model
		 */
		car.deleteCarByModel("Baleno");
        car.displayCars();
        
	}

}
