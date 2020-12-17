package com.xworkz.data;

import com.xworkz.data.transfer.CarShowRoom;
import com.xworkz.data.constants.Variants;
import com.xworkz.data.dto.CarDTO;

public class CarTester {

	public static void main(String[] args) {

		CarShowRoom carShowRoom = new CarShowRoom();

		CarDTO dto = new CarDTO();
		dto.setModel("Tesla");
		dto.setVariant(Variants.MID);
		dto.setPrice(2000000);

		carShowRoom.addCar(dto);

		CarDTO dto2 = new CarDTO("Swift", 600000, Variants.TOP);

		carShowRoom.addCar(dto2);

		CarDTO dto3 = new CarDTO("Jeep", 2800000, Variants.TOP);

		carShowRoom.addCar(dto3);

		CarDTO dto4 = new CarDTO("Lamborighini", 30000000, Variants.TOP);

		carShowRoom.addCar(dto4);
		
		CarDTO dto5 = new CarDTO("Maruti 800", 30000, Variants.BASE);
		
		carShowRoom.addCar(dto5);
		
		//CarDTO dto6 = new CarDTO("Ford Mustang", 7500000, Variants.TOP);
		
		//carShowRoom.addCar(dto6);
		
		carShowRoom.displayCars();
		carShowRoom.updateCarVariant(Variants.BASE, 3);
		carShowRoom.displayCars();
		carShowRoom.displayCarAtIndex(4);
		carShowRoom.displayCarByModel("Jeep");
		
		carShowRoom.deleteCarByModel("Jeep");
		carShowRoom.deleteCarByModel("Ferrari");
		
		
		

	}

}