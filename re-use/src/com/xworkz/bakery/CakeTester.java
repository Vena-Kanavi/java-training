package com.xworkz.bakery;
import com.xworkz.bakery.cake.Cake;
import com.xworkz.bakery.cake.HoneyCake;

public class CakeTester {
 public static void main(String[] args) {
	Cake cake=new Cake();
	System.out.println(cake.getFlavour());
	System.out.println(cake.getShape());
	System.out.println(cake.getSize());
	
	cake.setFlavour("Chocolate");
	System.out.println(cake.getFlavour());
	cake.setShape("round");
	System.out.println(cake.getShape());
	cake.setSize(1.13);
	System.out.println(cake.getSize());
	
	
	HoneyCake honey=new HoneyCake();
	honey.setFlavour("Honey");
	System.out.println(honey.getFlavour());
	honey.setShape("Square");
	System.out.println(honey.getShape());
	honey.setSize(2.25);
	System.out.println(honey.getSize());
	
	honey.setHoney(true);
	System.out.println(honey.isHoney());
}
}
