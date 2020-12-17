package com.xworkz.data.dto;

import com.xworkz.data.constants.Variants;

public class CarDTO {
	private String model;
	private double price;
	private Variants variant;

	public CarDTO() {
		super();
		System.out.println("invoked car constructor");
	}

	public CarDTO(String model, double price, Variants variant) {
		super();
		this.model = model;
		this.price = price;
		this.variant = variant;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Variants getVariant() {
		return variant;
	}

	public void setVariant(Variants variant) {
		this.variant = variant;
	}

}
