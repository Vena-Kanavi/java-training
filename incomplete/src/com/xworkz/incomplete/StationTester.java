package com.xworkz.incomplete;

import com.xworkz.incomplete.dto.PoliceStationDTO;

public class StationTester {

	public static void main(String[] args) {
		
		PoliceStationDTO dto=new PoliceStationDTO("Rajajinagar", 10, "Rajaji Nagar PoliceStation");
		
		System.out.println(dto);
		System.out.println(dto.toString());
		
		System.out.println(dto.hashCode());
		
		PoliceStationDTO dto2=new PoliceStationDTO("Jainagar", 8, "JaiNagar PoliceStation");
		System.out.println(dto2.hashCode());
		
		PoliceStationDTO dto3=new PoliceStationDTO("Jainagar", 8, "JaiNagar PoliceStation");
		
		boolean equals=dto2.equals(dto3);
		System.out.println(equals);
		
		
		if(equals) {
			System.out.println("dto is equal");
		}else {
			System.out.println("dto not equal");
		}
		
		dto2=dto3;
		boolean equal=dto2.equals("Same");
		System.out.println(equal);
		
		if(equal) {
			System.out.println("dto is equal");
		}else {
			System.out.println("dto not equal");
		}
		
		
		
	}

}
