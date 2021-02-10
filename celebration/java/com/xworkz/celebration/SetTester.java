package com.xworkz.celebration;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTester {

	public static void main(String[] args) {
		Set<String> favouritePlaces = new HashSet<String>();
		favouritePlaces.add("Paris");
		favouritePlaces.add("Mauritius");
		favouritePlaces.add(null);
		favouritePlaces.add(null);
		favouritePlaces.add("Bali");
		favouritePlaces.add("Munnar");
		favouritePlaces.add("Switzerland");
		favouritePlaces.add("Aus");
		favouritePlaces.add("Paris");
		favouritePlaces.add("Tirupati");
		favouritePlaces.add("Malasyia");
		favouritePlaces.add("Shivamoga");
		favouritePlaces.add("Goa");
		favouritePlaces.add("Malasyia");

		System.out.println(favouritePlaces.size());
		favouritePlaces.forEach(e->System.out.println(e));
		
		favouritePlaces=new LinkedHashSet<String>();
		favouritePlaces.add("Mauritius");
		favouritePlaces.add(null);
		favouritePlaces.add(null);
		favouritePlaces.add("Bali");
		favouritePlaces.add("Munnar");
		favouritePlaces.add("Switzerland");
		favouritePlaces.add("Munnar");
		System.out.println(favouritePlaces.size());
		favouritePlaces.forEach(f->System.out.println(f));
		
		
		
		
		
	}
}
