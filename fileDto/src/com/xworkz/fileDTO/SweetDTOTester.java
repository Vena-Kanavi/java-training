package com.xworkz.fileDTO;

import com.xworkz.fileDTO.file.SweetDTO;

import java.util.Arrays;

import com.xworkz.fileDTO.constants.Shape;


public class SweetDTOTester {

	public static void main(String[] args) {
		SweetDTO sweetDto=new SweetDTO("Mysore pak", 100);
		System.out.println(sweetDto.getName());
		System.out.println(sweetDto.getPrice());
		sweetDto.setPrice(150);
		System.out.println("updated price  "+sweetDto.getPrice());
		
		String[] color=new String[2];
		color[0]="cream";
		color[1]="yellowish";
		
		SweetDTO sweetDto2=new SweetDTO("Karnataka","2KG",Shape.RECTANGLE, color);
		System.out.println(sweetDto2.getPopularState());
		System.out.println(sweetDto2.getQuantity());
		System.out.println(Arrays.toString(sweetDto2.getColor()));
		
		System.out.println(sweetDto2.getShape());
		sweetDto2.setShape(Shape.ROUND);
		System.out.println(sweetDto2.getShape());
		
		
		

	}

}
