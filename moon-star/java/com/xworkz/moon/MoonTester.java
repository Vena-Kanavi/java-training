package com.xworkz.moon;

import com.xworkz.moon.dto.MenuDTO;
import com.xworkz.moon.dto.MenuDTO.Type;
import com.xworkz.moon.service.Finder;
import com.xworkz.moon.service.RestaurantService;
import com.xworkz.moon.service.RestaurantServiceImpl;

public class MoonTester {

	public static void main(String[] args) {
		
		RestaurantService service=new RestaurantServiceImpl();
	
		
//Functional Interface
		service.findAndDisplay(new Finder() {
			
			@Override
			public boolean test(MenuDTO dto) {
				if(dto.getPrice()>=200) {
					return true;
				}
				return false;
			}
		});

		
		
//(ref)->{};---------------lambda expression
				//() is required if you have more than one param
				//more than one statement		
		service.findAndDisplay(d->d.getPrice()>=200 && d.getType().equals(Type.NONVEG));

	}

}
