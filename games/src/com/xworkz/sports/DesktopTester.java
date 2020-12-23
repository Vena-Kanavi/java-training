package com.xworkz.sports;
import com.xworkz.sports.computer.Computer;
import com.xworkz.sports.computer.Desktop;
import com.xworkz.sports.computer.Laptop;
import com.xworkz.sports.constants.DevicesAttached;

public class DesktopTester {
public static void main(String[] args) {
	Desktop desktop=new Desktop();

	desktop.display();
	desktop.setCompanyName("Dell");
	System.out.println(desktop.getCompanyName());
	desktop.setDeviceAttached(DevicesAttached.MOUSE);
	System.out.println(desktop.getDeviceAttached());
	desktop.setTheme("Light");
	System.out.println(desktop.getTheme());
	
	
	Laptop laptop=new Laptop();
	
	laptop.setCompanyName("Lenova");
	System.out.println(laptop.getCompanyName());
	laptop.setDeviceAttached(DevicesAttached.SPEAKER);
	System.out.println(laptop.getDeviceAttached());
	
	
	Computer computer=new Laptop();
	computer=new Desktop();
	
	if(computer instanceof Laptop) {
		System.out.println("yes laptop is instance of computer");
		Laptop laptopCasted=(Laptop)computer;
	}
    else {
		System.out.println("no laptop is not instance of computer");
	}
	
	
}
}
