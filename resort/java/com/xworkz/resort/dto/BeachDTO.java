package com.xworkz.resort.dto;

public class BeachDTO implements Comparable<BeachDTO>{
	
	private String name;
	private int noOfResorts;
    private int iceLands;
    
    public BeachDTO() {
		// TODO Auto-generated constructor stub
	}

	public BeachDTO(String name, int noOfResorts, int iceLands) {
		super();
		this.name = name;
		this.noOfResorts = noOfResorts;
		this.iceLands = iceLands;
	}

	
	//this method is to compare string value
	@Override
	public int compareTo(BeachDTO o) {
		System.out.println("invoked compareTO");
		int compared=this.name.compareTo(o.getName());
		System.out.println(compared);
		return compared;
	}
	
	//this method is for comparing integer value
	public int compareTO(BeachDTO o) {
		System.out.println("invoked compareTO with greater,lesser,equal");
		if(this.noOfResorts==o.getNoOfResorts()) {
			System.out.println("equal return 0 ");
			return 0;
		}
		if(this.noOfResorts>o.getNoOfResorts()) {
			System.out.println("greater return positive value");
			return 1;
		}
		if(this.noOfResorts<o.getNoOfResorts()) {
			System.out.println("lesser return negative value");
			return -1;
		}
		return 0;
	}
	
	
	

	@Override
	public String toString() {
		return "BeachDTO [name=" + name + ", noOfResorts=" + noOfResorts + ", iceLands=" + iceLands + "]";
	}

	public String getName() {
		return name;
	}

	public int getNoOfResorts() {
		return noOfResorts;
	}

	public int getIceLands() {
		return iceLands;
	}
    
	

}
