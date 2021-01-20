package com.xworkz.solution;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class HomogeneousTester {

	public static void main(String[] args) {
		
		
		Object[] validAges=new Object[4];
		validAges[0]=21;
		validAges[1]=18;
		validAges[2]="Not age";
		validAges[3]=new Thread();
		
		
		for(int i=0;i<validAges.length;i++) {
			System.out.println(validAges[i]);
			if(validAges[i] instanceof String) {
				String age=(String)validAges[i];
				System.out.println(age.toUpperCase());
			}
		}
		
		loopAndChecktype(validAges);
		
		
		Collection<String> mobiles=new ArrayList();
		mobiles.add("Samsung");
		mobiles.add("Coolpad");
		mobiles.add("Realmi");
		
		
		Iterator iterator=mobiles.iterator();
		int count=0;
		while(iterator.hasNext()) {
			System.out.println("element present");
			Object obj=iterator.next();
			if(obj instanceof String) {
				System.out.println("String found");
				count++;
			}
		}
		System.out.println("string count is "+count);

	}
	
	public static void loopAndChecktype(Object[] arrays)
	{
		for (int i = 0; i < arrays.length; i++) {
			System.out.println(arrays[i]);
			if(arrays[i] instanceof String)
			{
			String values=(String)arrays[i];
			System.out.println(values.toUpperCase());
			}
			
			if(arrays[i] instanceof Thread)
			{
				Thread t=(Thread)arrays[i];
				t.start();
			}
		}
	}

}
																			