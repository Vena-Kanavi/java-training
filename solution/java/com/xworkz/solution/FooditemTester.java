package com.xworkz.solution;

import java.util.ArrayList;
import java.util.Collection;

public class FooditemTester {

	public static void main(String[] args) {
		
		String dosa="Masala Dosa";
		String chicken="Chicken Kabab";
		String paneer="Palak Paneer";
		String rice="Gobi Rice";
		
		Collection<String> foodItems=new ArrayList();
		foodItems.add(dosa);
		foodItems.add(chicken);
		foodItems.add(paneer);
		foodItems.add(rice);
				
		int totalNo=foodItems.size();
		System.out.println("Total Mobile numbers "+totalNo);
		
		boolean present=foodItems.contains(dosa);
		System.out.println("Food Item is present "+present);
		
	}

}
