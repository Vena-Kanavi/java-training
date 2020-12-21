package com.xworkz.bakery;

import com.xworkz.bakery.cake.Biscuit;
import com.xworkz.bakery.cake.CreamBiscuit;

public class BiscuitTester {

	public static void main(String[] args) {
		Biscuit biscuit=new Biscuit();
		biscuit.setFlavour("Chocolate");
		System.out.println(biscuit.getFlavour());
		biscuit.setShape("Round");
		System.out.println(biscuit.getShape());
		biscuit.setSize(2.3);
		System.out.println(biscuit.getSize());
		
		
		CreamBiscuit cream=new CreamBiscuit();
		cream.setFlavour("Orange");
		System.out.println(cream.getFlavour());
		cream.setShape("Square");
		System.out.println(cream.getShape());
		cream.setSize(1.55);
		cream.setCream(true);
		System.out.println(cream.isCream());
		
		Object object=new Object();
		System.out.println(object.getClass());
		System.out.println(object.hashCode());
		object.notify();
		object.notifyAll();
		System.out.println(object.toString());
	
		
		

	}

}
