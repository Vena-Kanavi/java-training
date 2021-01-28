package com.xworkz.cosmetic;

import com.xworkz.cosmetic.constant.CosmeticType;
import com.xworkz.cosmetic.dao.CosmeticDAO;
import com.xworkz.cosmetic.dao.CosmeticDAOImpl;
import com.xworkz.cosmetic.dto.CosmeticDTO;
import com.xworkz.cosmetic.dto.CosmeticShades;
import com.xworkz.cosmetic.service.CosmeticService;
import com.xworkz.cosmetic.service.CosmeticServiceImpl;

public class ValidationTester {

	public static void main(String[] args) {
		CosmeticDTO cosmeticDTO=new CosmeticDTO();
		cosmeticDTO.setBrand("Maybelline");
		cosmeticDTO.setPrice(300);
		cosmeticDTO.setQuantity(2);
		cosmeticDTO.setShades(CosmeticShades.PINK);
		cosmeticDTO.setType(CosmeticType.LIPSTIC);
		
		
		CosmeticDAO dao=new CosmeticDAOImpl();
		dao.save(cosmeticDTO);
		
		CosmeticService service=new CosmeticServiceImpl(dao);
		service.validateAndSave(cosmeticDTO);
		
		
		CosmeticDTO dto=new CosmeticDTO("Sugr", CosmeticShades.PLUM, CosmeticType.FOUNDATION, 1000, 2);
		service.validateAndSave(dto);
		System.out.println(service.size());
		
		service.deleteByBrand("Sugr");
		
		System.out.println(service.size());
		
		

	}

}
