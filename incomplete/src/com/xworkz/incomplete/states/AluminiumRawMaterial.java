package com.xworkz.incomplete.states;

import com.xworkz.incomplete.inherit.RawMaterial;

public class AluminiumRawMaterial extends RawMaterial{
	
	public void AluminiumRawMaterial() {
		String name=super.name;
		System.out.println("invoked AluminiumRawMaterial");
	}
	
	@Override
	public void manufacture() {
		System.out.println("invoked manufacture method");
		
	}
}
