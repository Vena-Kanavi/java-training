package com.xworkz.fileDTO;

import com.xworkz.fileDTO.file.MobileDTO;

public class MobileDTOTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MobileDTO mobileDto=new MobileDTO("VIVO");
		System.out.println(mobileDto.getName());
		mobileDto.setName("REAL ME");
		System.out.println(mobileDto.getName());
		
		
		MobileDTO mobileDto1=new MobileDTO("Red", "16GB", 10000, 23000);
		System.out.println(mobileDto1.getColor());
		System.out.println(mobileDto1.getBatteryCapacity());
		System.out.println(mobileDto1.getStorage());
		System.out.println(mobileDto1.getPrice());

	}

}
