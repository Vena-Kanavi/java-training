package com.xworkz.fileDTO;

import java.util.Arrays;

import com.xworkz.fileDTO.file.CountryDTO;

public class CountryDTOTester {

	public static void main(String[] args) {

		CountryDTO countryDto = new CountryDTO();
		System.out.println(countryDto.getName());
		System.out.println(countryDto.getPresident());

		CountryDTO countryDto1 = new CountryDTO("China");
		countryDto1.setName("India");
		System.out.println(countryDto1.getName());

		CountryDTO countryDto2 = new CountryDTO("India", 12345678l);
		System.out.println(countryDto2.getName());
		countryDto.setPopulation(1380004385l);
		System.out.println(countryDto.getPopulation());

		CountryDTO countryDto3 = new CountryDTO(13800043851l, "Narendra Modi", "Pranab Mukarji");
		System.out.println(countryDto3.getPopulation());
		System.out.println(countryDto3.getPrimeMinister());
		countryDto3.setPresident("Ramanath Kovind");
		System.out.println(countryDto3.getPresident());

		String[] states = new String[3];
		states[0] = "Karnataka";
		states[1] = "Goa";
		states[2] = "Kerala";

		String[] language = new String[2];
		language[0] = "kannada";
		language[1] = "Telugu";
		CountryDTO countryDto4 = new CountryDTO(states, "Narendra Modi", "Ramanath Kovind", language);
		System.out.println(countryDto4.getStates());
		countryDto4.setStates(new String[] { "Jammu&Kashmir", "New Delhi", "Rajastan", "Gujarat", "Orissa", "MP",
				"Assam", "west Bengal", "Goa", "Maharastra", "Arunachal Pradesh", "Jharkand", "Karnataka", "AP", "TN",
				"Kerala", "Jharkand", "Bihar" });
		System.out.println(Arrays.toString(countryDto4.getStates()));
		System.out.println(countryDto4.getPrimeMinister());
		System.out.println(countryDto4.getPresident());

		countryDto4.setLanguages(new String[] { "Kannada", "Tamil", "Teluga", "Marathi", "Rajastani", "Mlayalam" });
		System.out.println(Arrays.toString(countryDto4.getLanguages()));

	}

}
