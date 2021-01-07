package com.xworkz.weapons;

import com.xworkz.weapons.brahmos.MissleBrahmosWeapon;
import com.xworkz.weapons.gun.Weapon;
import com.xworkz.weapons.gunweapon.AK47;
import com.xworkz.weapons.gunweapon.MachineGunWeapon;

public class WeaponTester {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		MissleBrahmosWeapon weapon=new MissleBrahmosWeapon();
		weapon.abort();
		weapon.damage();
		weapon.destroy();
		System.out.println(MissleBrahmosWeapon.country);
		System.out.println("*******************************************");
		
		
		
		MissleBrahmosWeapon weapon1=weapon.clone();
		System.out.println(weapon1.country);
		System.out.println("**************************************");
		
		
		MachineGunWeapon gunWeapon=new MachineGunWeapon();
		gunWeapon.abort();
		gunWeapon.damage();
		gunWeapon.trigger();
		System.out.println(MachineGunWeapon.country);
		System.out.println("***********************************************");
		
		AK47 ak47=new AK47();
		ak47.abort();
		ak47.damage();
		ak47.trigger();
		System.out.println(AK47.country);
		System.out.println("***************************************");
		
		
		Weapon weapon2=new MachineGunWeapon();
		weapon2.damage();
		System.out.println("country from weapon "+Weapon.country);
		
		
	}
	
	

}
