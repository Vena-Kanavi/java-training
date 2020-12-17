package com.xworkz.data.transfer;

import com.xworkz.data.dto.ManagerDTO;

import java.util.Arrays;

import com.xworkz.data.constants.Variants;
import com.xworkz.data.dto.CarDTO;

public class CarShowRoom {

	private String name;
	private String location;
	private ManagerDTO managerDTO;
	private CarDTO[] cars = new CarDTO[5];
	private int currentIndex = 0;

	public CarShowRoom() {
		System.out.println("CarShowRoom default constructor");
	}

	public CarShowRoom(String name, String location) {
		super();
		this.name = name;
		this.setLocation(location);
	}

	public void addManager(String name, long contactNo) {
		if (name != null && contactNo > 0) {
			this.managerDTO = new ManagerDTO(name, contactNo);
			System.out.println("manager added, data is valid");
		} else {
			System.out.println("provide proper details,data is invalid");
		}
	}

	public void addManager(ManagerDTO dto) {
		if (dto != null) {
			this.managerDTO = dto;
			System.out.println("manager added");
		} else {
			System.out.println("manager not added, data is invalid");
		}
	}

	public void displayManager() {
		if (this.managerDTO != null) {
			System.out.println(this.managerDTO.getName());
			System.out.println(this.managerDTO.getContactNo());
		} else {
			System.out.println("manager is not there :: null");
		}
	}

	public void removeManager() {
		this.managerDTO = null;
	}

	public void updateManager(long contactNo) {
		if (contactNo > 0 && this.managerDTO != null) {
			this.managerDTO.setContactNo(contactNo);
			System.out.println("details are valid, updated contact number");
		} else {
			System.out.println("cannot update contact number,data is invalid");
		}

	}

	public void updateManager(String name) {
		if (name != null && this.managerDTO != null) {
			this.managerDTO.setName(name);
			System.out.println("details are valid, updated name");
		} else {
			System.out.println("cannot update name,data is invalid");
		}
	}

	/**
	 * adding cars to the car show room
	 * 
	 * @param dto
	 */

	public void addCar(CarDTO dto) {
		if (dto != null && this.currentIndex < 5) {
			System.out.println("we can add car");
			System.out.println("current index is " + this.currentIndex);
			boolean car = false;
			this.cars[this.currentIndex] = dto;
			this.currentIndex++;
		} else {
			if (dto == null) {
				System.out.println("we cannot add an empty or null ");
			}
			if (dto != null) {
				System.out.println("cannot add more car, total  " + this.currentIndex);
			}
			System.out.println("current index : " + this.currentIndex);
		}
		// System.out.println("car not added, data is invalid");
	}

	/**
	 * displaying cars
	 */
	public void displayCars() {
		for (int i = 0; i < this.cars.length; i++) {
			CarDTO dto = this.cars[i];
			if (dto != null) {
				// System.out.println(dto);
				System.out.println(dto.getModel());
				System.out.println(dto.getPrice());
				System.out.println(dto.getVariant());
			}
		}
	}

	/**
	 * updating car by new variant
	 * 
	 * @param newVariant
	 * @param indexToUpdate
	 */
	public void updateCarVariant(Variants newVariant, int indexToUpdate) {
		if (newVariant != null && indexToUpdate >= 0 && indexToUpdate < 5) {
			System.out.println("car is found at index " + indexToUpdate);
			System.out.println("updating variant " + newVariant);
			CarDTO cardto = this.cars[indexToUpdate];
			cardto.setVariant(newVariant);

		}
	}

	/**
	 * updating car using index value
	 * 
	 * @param indexToDisplay
	 */
	public void displayCarAtIndex(int indexToDisplay) {
		if (indexToDisplay >= 0 && indexToDisplay < 5) {
			System.out.println("Car At Index: " + indexToDisplay);
			CarDTO ref = this.cars[indexToDisplay];
			System.out.println(ref.getModel());
			System.out.println(ref.getPrice());
			System.out.println(ref.getVariant());
		}
	}

	/**
	 * displaying car by model
	 * 
	 * @param models
	 */
	public void displayCarByModel(String models) {
		if (models != null) {
			System.out.println("Car model is: " + models);
			boolean model = false;
			for (int i = 0; i < this.cars.length; i++) {
				CarDTO ref = this.cars[i];
				String localModel = ref.getModel();
				if (models.equals(localModel)) {
					System.out.println(ref.getModel());
					System.out.println(ref.getPrice());
					System.out.println(ref.getVariant());
					model = true;
					break;
				}
			}
			if (model == false) {
				System.out.println("model not found");
			}
		}
	}

	/**
	 * deleting car by model
	 * 
	 * @param model
	 */

	public void deleteCarByModel(String model) {
		if (model != null) {
			// System.out.println("Car model is: " + model);
			for (int i = 0; i < this.cars.length; i++) {
				boolean carDeleted = false;
				CarDTO ref = this.cars[i];
				String localModel = ref.getModel();
				if (model.equals(localModel)) {
					this.cars = null;
					System.out.println("car deleted is  " + model);
					carDeleted = true;
					break;
				}
				if (carDeleted == false) {
					System.out.println("model not found");
				}
			}
		}
	}

	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
