package com.xworkz.solution;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionTester {

	public static void main(String[] args) {

		String cadbury = "Milky Bar";
		String nestle = "Kit Kat";
		String hersheys = "Hershey's Kisses";
		String parle = "Kiss me";
		String amul = "Dark Chocolate";

		boolean added = false;
		Collection chocolates = new ArrayList();
		added = chocolates.add(cadbury);
		System.out.println(added);
		added = chocolates.add(hersheys);
		System.out.println(added);
		added = chocolates.add(nestle);
		System.out.println(added);
		added = chocolates.add(amul);
		System.out.println(added);
		added = chocolates.add(parle);
		System.out.println(added);

		int total = chocolates.size();
		System.out.println("total number of chocolates " + total);

		boolean removed = chocolates.remove(amul);
		System.out.println(removed);

		total = chocolates.size();
		System.out.println("total number of chocolates " + total);

		String campco = "Dark Fantacy";
		removed = chocolates.remove(campco);
		System.out.println("dark fantacy is removed " + removed);

		total = chocolates.size();
		System.out.println("total number of chocolates " + total);

		added = chocolates.add(null);
		System.out.println(added);
		total = chocolates.size();
		System.out.println("total number of chocolates " + total);

		added = chocolates.add(null);
		System.out.println(added);
		total = chocolates.size();
		System.out.println("total number of chocolates " + total);

		// Object newlist=chocolates.stream().distinct().collect(Collectors.toList());
		// System.out.println("removed duplicate elements "+newlist);
		

		removed = chocolates.remove(null);
		System.out.println("element null is removed " + removed);

		
		System.out.println("looping of objects*****************");

		Object[] convertedChocolates = chocolates.toArray();
		for (int i = 0; i < convertedChocolates.length; i++) {
			System.out.println(convertedChocolates[i]);
		}

		Iterator iterator = chocolates.iterator();
		while (iterator.hasNext()) {
			System.out.println("element present");
			Object str = iterator.next();
			System.out.println(str);

		}
		// System.out.println(chocolates);

		
		boolean containsElement = chocolates.contains(hersheys);
		System.out.println("contains hersheys "+containsElement);
		
		
		
		boolean empty=chocolates.isEmpty();
		System.out.println("isEmpty method "+empty);

	}

}
