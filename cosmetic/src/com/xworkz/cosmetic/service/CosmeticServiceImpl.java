package com.xworkz.cosmetic.service;

import com.xworkz.cosmetic.constant.CosmeticType;
import com.xworkz.cosmetic.dao.CosmeticDAO;
import com.xworkz.cosmetic.dto.CosmeticDTO;
import com.xworkz.cosmetic.dto.CosmeticShades;

public class CosmeticServiceImpl implements CosmeticService {
	
	private CosmeticDAO cosmeticDAO;

	public CosmeticServiceImpl(CosmeticDAO dao) {
		System.out.println("invoked CosmeticServiceImpl");
		this.cosmeticDAO=dao;
	}

	@Override
	public boolean validateAndSave(CosmeticDTO cosmeticDTO) {
		boolean validData = false;
		if (cosmeticDTO != null) {
			System.out.println("dto is not null can save fields");
			String brand = cosmeticDTO.getBrand();
			if (brand != null && brand.length() >= 3 && !brand.isEmpty() && !brand.contains(" ")) {
				System.out.println("brand is valid");
				validData = true;
			} else {
				System.out.println("brand is not valid");
				validData = false;
			}

			if (validData) {
				CosmeticType type = cosmeticDTO.getType();
				if (type != null) {
					System.out.println("Type is valid");
					validData = true;
				} else {
					System.out.println("type is invalid");
					validData = false;
				}
			}
			if (validData) {
				double price = cosmeticDTO.getPrice();
				if (price > 0) {
					System.out.println("price is valid");
					validData = true;
				} else {
					System.out.println("price is invalid");
					validData = false;
				}
			}
			if (validData) {
				CosmeticShades shades = cosmeticDTO.getShades();
				if (shades != null) {
					System.out.println("shades is valid");
					validData = true;
				} else {
					System.out.println("shades is invalid");
					validData = false;
				}
			}

			if (validData) {
				int quantity = cosmeticDTO.getQuantity();
				if (quantity > 0 && quantity <= 100) {
					System.out.println("Type is valid");
					validData = true;
				} else {
					System.out.println("type is invalid");
					validData = false;
				}
			}
			if(validData)
			{
				System.out.println("All data valid");
				cosmeticDAO.save(cosmeticDTO);				
			}

		} else {
			System.out.println("dto is null cannot save fields");
		}
		return false;
	}
	
	@Override
	public void deleteByBrand(String brand) {
		System.out.println("invoked deleteByBrand");
		if (brand != null && !brand.isEmpty() && !brand.contains(" ") && brand.length() >= 3) {
			System.out.println("brand is valid, can delete" + brand);
			this.cosmeticDAO.deleteByBrand(brand);
		} else {
			System.out.println("invalid brand");
		}
	}
	
	
	@Override
	public int size() {
		return this.cosmeticDAO.totalSize();
	}

}
