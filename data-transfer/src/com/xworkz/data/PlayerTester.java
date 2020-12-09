package com.xworkz.data;
import java.util.Arrays;

import com.xworkz.data.transfer.PlayerDTO;

public class PlayerTester {

	public static void main(String[] args) {
		
		String[] sport= {"National Football League","Major League Baseball"};
		String awards[]= {"Heisman Trophy"};
		PlayerDTO playerDTO=new PlayerDTO();
		playerDTO.setName("Bo Jackson");
		System.out.println(playerDTO.getName());
		playerDTO.setCountry("America");
		System.out.println(playerDTO.getCountry());
		String sports=Arrays.toString(sport);
		playerDTO.setSports(sport);
		System.out.println(playerDTO.getSports());
		playerDTO.setAwards(awards);
		System.out.println(playerDTO.getAwards());

	}

}
