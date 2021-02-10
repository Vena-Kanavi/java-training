package com.xworkz.solution;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.solution.dto.BarDTO;

public class BarTester {

	public static void main(String[] args) {
		
		BarDTO dto1=new BarDTO("magic moments", "King Fisher", 48);
		
		BarDTO dto2=new BarDTO("IB", "King Fisher", 6);
		
		BarDTO dto3=new BarDTO("Rum", "Old Monk", 8);
		
		BarDTO dto4=new BarDTO("Storm", "NA", 32);
		
		List<BarDTO> listDTOs=new ArrayList<BarDTO>();
		
		listDTOs.add(dto1);
		listDTOs.add(dto2);
		listDTOs.add(dto3);
		listDTOs.add(dto4);
		
		//System.out.println(listDTOs);
		
		BarDTO dto5=new BarDTO("magic moments", "NA", 3);
		//listDTOs.add(dto5);
		
		//listDTOs.remove(1);
		
		//listDTOs.remove(dto5);
		//System.out.println("removed list at index1 "+listDTOs);
		
		
		int index=listDTOs.indexOf(dto5);
		System.out.println("index is dto5 is "+index);
		
		//int lastIndex=listDTOs.lastIndexOf(dto3);
		//System.out.println("last index of dto5 is "+lastIndex);
		
		//BarDTO list=listDTOs.set(2, dto5);
		//System.out.println(list);
		
		
		for (BarDTO alcoholDTO : listDTOs) {
			System.out.println(alcoholDTO);
		}

	}

}
