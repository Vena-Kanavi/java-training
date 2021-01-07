package com.xworkz.phonebook;

import com.xworkz.phonebook.dto.PhoneBookDTO;

public class CloneTester {
	public static void main(String[] args) throws CloneNotSupportedException {
		PhoneBookDTO dto=new PhoneBookDTO();
		dto.setName("Chetana");
		dto.setPincode("582116");
		dto.setPhoneNo(7204672052l);
		
		
		PhoneBookDTO dto2=dto.clone();
		System.out.println(dto2.getName()+" "+dto2.getPhoneNo()+" "+dto2.getPincode());
		
		PhoneBookDTO dto3=new PhoneBookDTO();
		dto3.setName("Vena");
		dto3.setPhoneNo(7829731400l);
		dto3.setPincode("582116");
		
		PhoneBookDTO dto4=dto3.clone();
		System.out.println(dto4.getName()+" "+dto4.getPhoneNo()+" "+dto4.getPincode());
		
		
	}

}
