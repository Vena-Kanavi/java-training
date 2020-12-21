package com.xworkz.bakery.cake;

public class Cake {
	private String flavour;
	private String shape;
	private double size;
	
	public void tester() {
		System.out.println("invoked tester");
	}

	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}
	

}
