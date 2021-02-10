package com.xworkz.resort;

import java.util.LinkedList;
import java.util.List;

import com.xworkz.resort.dao.ResortDAO;
import com.xworkz.resort.dao.ResortDAOImpl;
import com.xworkz.resort.dto.ResortDTO;

public class ResortTester {
	public static void main(String[] args) {
		List<ResortDTO> list = new LinkedList<ResortDTO>();

		ResortDAO dao = new ResortDAOImpl(list);

		//ResortService resortService = new ResortServiceImpl(dao);

		ResortDTO dto = new ResortDTO("Ramanagara", "Shillandara", "KiranRaj", 15);
		dto.setPricePerHead(2000);
		dto.setNoOfEmployees(10);
		dto.setOffers(false);
		dto.setPhoneNo(7829731400l);
		dto.setPoolExist(false);
        dto.setRating(4);
		dao.save(dto);
		
		
		ResortDTO dto2=new ResortDTO("UttaraKannada", "KaliAdventure", "Surya", 25);
		dto2.setPricePerHead(2000);
		dto2.setNoOfEmployees(15);
		dto2.setOffers(true);
		dto2.setPhoneNo(7229731400l);
		dto2.setPoolExist(false);
        dto2.setRating(3);
		dao.save(dto2);
		
		System.out.println(dao.totalResortSize());
		
		dao.updateLocationByName("Dandeli", "KaliAdventure");
		
		dao.updateLocationByNameandRating("Coorg", "Shillandara", 4);
		
		dao.deleteByNameAndLocation("Shillandara", "Coorg");
		
		dao.addMultipleResorts(list);
		
		
	}

}
