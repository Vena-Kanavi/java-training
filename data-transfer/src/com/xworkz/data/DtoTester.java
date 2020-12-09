package com.xworkz.data;
import com.xworkz.data.transfer.CustomerDTO;

public class DtoTester {

	public static void main(String[] args) {
		CustomerDTO customerDto=new CustomerDTO();
		customerDto.setCustomerId(2432);
		System.out.println(customerDto.getCustomerId());
		customerDto.setName("Vena");
		System.out.println(customerDto.getName());
		customerDto.setContactNo(7829731400l);
		System.out.println(customerDto.getContactNo());
		customerDto.setEmail("vena.xworkx@gmail.com");
		System.out.println(customerDto.getEmail());
		
		
		
		CustomerDTO customerDto2=new CustomerDTO();
		customerDto2.setCustomerId(1756);
		System.out.println(customerDto2.getCustomerId());
		customerDto2.setName("Pramod");
		System.out.println(customerDto2.getName());
		customerDto2.setContactNo(7204672052l);
		System.out.println(customerDto2.getContactNo());
		customerDto2.setEmail("pramodkanavi1997@gmail.com");
		System.out.println(customerDto2.getEmail());
		

	}

}
