package com.xworkz.solution.dto;

public class ShoppingcartDTO {
	private String name;
	private double price;
	private int quantity;

	public ShoppingcartDTO() {
		System.out.println("default constructor");
	}

	@Override
	public String toString() {
		return "ShoppingcartDTO [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj instanceof ShoppingcartDTO) {
			ShoppingcartDTO dto = (ShoppingcartDTO) obj;
			if (dto.getName().equals(this.name) && dto.getPrice() == this.price) {
				System.out.println("name and price are matching ");
				return true;
			}
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
