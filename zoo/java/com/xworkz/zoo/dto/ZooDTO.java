package com.xworkz.zoo.dto;

public class ZooDTO implements Cloneable{
	
	private String name;
	private String location;
	private int noOfAnimals;
	private int entryFees;
	private boolean safari;
	
	
	public ZooDTO() {
		System.out.println("Zoo constructor is created");
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public int getNoOfAnimals() {
		return noOfAnimals;
	}


	public void setNoOfAnimals(int noOfAnimals) {
		this.noOfAnimals = noOfAnimals;
	}


	public int getEntryFees() {
		return entryFees;
	}


	public void setEntryFees(int entryFees) {
		this.entryFees = entryFees;
	}
	
	public boolean isSafari() {
		return safari;
	}


	public void setSafari(boolean safari) {
		this.safari = safari;
	}


	@Override
	public int hashCode() {
		System.out.println("invoked hashcode method");
		return 23;
	}
	
	
	@Override
	public String toString() {
		return "ZooDTO [name=" + name + ", location=" + location + ", noOfAnimals=" + noOfAnimals + ", entryFees="
				+ entryFees + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null)
			if(this==obj) {
				return true;
			}else {
				if(obj instanceof ZooDTO) {
					ZooDTO dto=(ZooDTO)obj;
					if(dto.getName()==this.name) {
						System.out.println("two strings are equal");
						return true;
					}
					return false;
				}
			}
		return false;
	}
	
	
	
	@Override
	public ZooDTO clone() throws CloneNotSupportedException {
		ZooDTO dto=new ZooDTO();
		this.entryFees=dto.getEntryFees();
        this.safari=dto.isSafari();
		return (ZooDTO) super.clone();
	}

}
