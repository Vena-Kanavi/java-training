package com.xworkz.palace;

import com.xworkz.palace.dto.PalaceDTO;

public class PalaceTester {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		String location="Mysuru";
		String kingName="Yaduveer Krishnadatta Chamaraja";
		String queenName="Pramoda Kumari";
		
		
		PalaceDTO dto=new PalaceDTO();
		dto.setKingName(kingName);
		dto.setQueenName(queenName);
		dto.setLocation(location);
		System.out.println(dto.getLocation()+" "+dto.getQueenName());
		System.out.println("King name is "+dto.getKingName());
		System.out.println();
		
		
		PalaceDTO dto2=dto.clone();
		System.out.println(dto2.getLocation()+" "+dto2.getQueenName());
		System.out.println("King name is "+dto2.getKingName());
		dto2.equals(dto);
		dto2.hashCode();
		dto2.toString();
		

	}

}
