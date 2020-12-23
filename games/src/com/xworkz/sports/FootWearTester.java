
package com.xworkz.sports;

import com.xworkz.sports.constants.FootWearType;
import com.xworkz.sports.footwear.ShoeFootWear;

public class FootWearTester {

			public static void main(String[] args) {

				
				ShoeFootWear shoeFootWear=new ShoeFootWear();
				
				shoeFootWear.setBrand("Puma");
				shoeFootWear.setSize(8);
				shoeFootWear.setPrice(4000);
				shoeFootWear.setFootWearType(FootWearType.SPORTS);
				
				shoeFootWear.displayDetails();
				
				double dis=shoeFootWear.calculateDiscount();
				System.out.println(dis);
				
				
				
			}



}


