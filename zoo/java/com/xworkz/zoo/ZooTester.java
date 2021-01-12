package com.xworkz.zoo;

import com.xworkz.zoo.dto.ZooDTO;

public class ZooTester {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		String name="Shri Chamarajendra Zoological Garden";
		String location="Mysuru";
		int noOfAnimals=200;
		int entryFees=300;
		boolean safari=true;
	
		
		ZooDTO dto=new ZooDTO();
		dto.setName(name);
		dto.setLocation(location);
		dto.setNoOfAnimals(noOfAnimals);
		dto.setSafari(safari);
		dto.setEntryFees(entryFees);
		System.out.println(dto.getName()+" "+dto.getLocation()+" "+dto.getNoOfAnimals());
		System.out.println("entry fees "+dto.getEntryFees());
		System.out.println(dto.isSafari());
		System.out.println();
		
		ZooDTO dto2=dto.clone();
		System.out.println(dto2.getName()+" "+dto2.getLocation()+" "+dto2.getNoOfAnimals());
		System.out.println("entry fees "+dto2.getEntryFees());
		System.out.println(dto2.isSafari());
		dto2.hashCode();
		dto2.toString();
		System.out.println(dto.equals(dto2));
		
		

	}

}
