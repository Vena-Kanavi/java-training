package com.xworkz.resort.service;

import com.xworkz.resort.dto.ResortDTO;

public interface ResortService {

	boolean validateAndSave(ResortDTO dto);
	
	boolean validateAndUpdateLocationByName(String location, String name);

	boolean validateAndUpdateLocationByNameandRating(String location, String name, float rating);

	boolean validatAndDeleteByNameAndLocation(String name, String location);
	
	
	int validateTotalResortSize();
}
