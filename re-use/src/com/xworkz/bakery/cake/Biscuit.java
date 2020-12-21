package com.xworkz.bakery.cake;

public class Biscuit extends Object {
	private String shape;
	private String flavour;
	private double size;
	
	public void tester() {
		System.out.println("invoked tester");
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}
	

}
