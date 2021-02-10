package com.xworkz.celebration;

import java.util.HashSet;
import java.util.Set;

import com.xworkz.celebration.dto.FreedomFighterDTO;
import com.xworkz.celebration.dto.FreedomFighterDTO.Gender;

public class FreedomFighterTester {
	public static void main(String[] args) {
		
		FreedomFighterDTO dto=new FreedomFighterDTO("Jhansi Rani", "India", Gender.FEMALE);
		FreedomFighterDTO dto1=new FreedomFighterDTO("Bhagat Singh", "India", Gender.MALE);
		FreedomFighterDTO dto2=new FreedomFighterDTO("Onake Obhavva", "India", Gender.FEMALE);
		FreedomFighterDTO  dto3=new FreedomFighterDTO("Subhash Chandra Bos", "India", Gender.MALE);
		FreedomFighterDTO dto4=new FreedomFighterDTO("Jhansi Rani", "India", Gender.FEMALE);
		
		Set<FreedomFighterDTO> dtos=new HashSet<FreedomFighterDTO>();
		dtos.add(dto);
		dtos.add(dto1);
		dtos.add(dto2);
		dtos.add(dto3);
		dtos.add(dto4);
		
		System.out.println(dtos.size());
		
		dtos.forEach(f->System.out.println(f.getName()));
		
		
	}

}
