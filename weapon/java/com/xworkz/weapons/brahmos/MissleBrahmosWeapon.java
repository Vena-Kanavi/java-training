package com.xworkz.weapons.brahmos;

public class MissleBrahmosWeapon implements BrahmosWeapon,Cloneable{
	
	private int range;

	@Override
	public void damage() {
		System.out.println("invoked damage from missleBrahmos");
		
	}

	@Override
	public void abort() {
		System.out.println("invoked abort from missleBrahmos");
		
	}

	@Override
	public void destroy() {
		System.out.println("invoked destroy from missleBrahmos");
		
	}
	
	
	@Override
	public MissleBrahmosWeapon clone() throws CloneNotSupportedException {
		System.out.println("invoked clone method");
		return (MissleBrahmosWeapon) super.clone();
	}
	

}
