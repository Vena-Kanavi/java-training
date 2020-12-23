package com.xworkz.sports;

import com.xworkz.sports.computer.Computer;
import com.xworkz.sports.computer.Desktop;
import com.xworkz.sports.computer.Laptop;
import com.xworkz.sports.constants.DevicesAttached;

public class ComputerTester {

	public static void main(String[] args) {
		Computer computer=new Desktop();
		
		Desktop casted=(Desktop)computer;
		
		casted.display();
		casted.setCompanyName("HP");
		System.out.println(casted.getCompanyName());
		casted.setDeviceAttached(DevicesAttached.KEYBOARD);
		System.out.println(casted.getDeviceAttached());
		casted.setTheme("Dark");
		System.out.println(casted.getTheme());
		casted.setSize("Medium");
		System.out.println(casted.getSize());
		casted.turnOn();
		
		
		
		Computer computer1=new Laptop();
		
		Laptop laptop=(Laptop)computer1;
		
		laptop.connectsToPhone();
		System.out.println(laptop.getCompanyName());
		laptop.setProcessor("Intel");
		System.out.println(laptop.getProcessor());
	}

}
