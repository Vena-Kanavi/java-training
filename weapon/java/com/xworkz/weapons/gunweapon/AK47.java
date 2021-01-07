package com.xworkz.weapons.gunweapon;

public class AK47 extends MachineGunWeapon{
	
	@Override
	public boolean trigger() {
		System.out.println("invoked trigger method");
		return super.trigger();
	}

}
