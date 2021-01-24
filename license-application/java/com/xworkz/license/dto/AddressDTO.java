package com.xworkz.license.dto;

import java.util.Date;

import com.xworkz.license.constants.BloodGroup;
import com.xworkz.license.constants.Gender;

public class AddressDTO extends CommonDTO{
	
	private String name;
	private String street;
	private int doorNo;
	private String buildingName;
	private String city;
	private String state;
	private int pincode;
	

	public AddressDTO() {
		System.out.println("invoked address dto");
	}
	public AddressDTO(String name, String street, int doorNo, String buildingName, String city, String state,
			int pincode) {
		super();
		this.name = name;
		this.street = street;
		this.doorNo = doorNo;
		this.buildingName = buildingName;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}

	public AddressDTO(String name, int age, Date dob, long mobileNo, BloodGroup bloodGroup, Gender gender) {
		super(name, age, dob, mobileNo, bloodGroup, gender);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "AddressDTO [name=" + name + ", street=" + street + ", doorNo=" + doorNo + ", buildingName="
				+ buildingName + ", city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
	}
	
	
	
       	
}
