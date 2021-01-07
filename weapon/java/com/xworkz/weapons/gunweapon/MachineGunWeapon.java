package com.xworkz.weapons.gunweapon;

public class MachineGunWeapon implements GunWeapon {

	private int noOfBullets;

	@Override
	public void damage() {
		System.out.println("invoked damage from machine gun");

	}

	@Override
	public void abort() {
		System.out.println("invoked abort from machinegun");

	}

	@Override
	public boolean trigger() {
		System.out.println("invoked trigger");
		return true;
	}

	@Override
	public String toString() {
		return "MachineGunWeapon [noOfBullets=" + noOfBullets + "]";
	}

	@Override
	public int hashCode() {
		System.out.println("invoked hash code method");
		return 25;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null)
			System.out.println("obj is not null");
		if (this == obj) {
			return true;
		} else {
			if (obj instanceof MachineGunWeapon) {
				MachineGunWeapon gunWeapon = (MachineGunWeapon) obj;
				if(gunWeapon.getNoOfBullets()==this.noOfBullets) {
				return true;
				}
			}
			return false;
		}

	}
	public int getNoOfBullets() {
		return noOfBullets;
	}
}
