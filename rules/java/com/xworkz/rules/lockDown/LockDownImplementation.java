package com.xworkz.rules.lockDown;

public class LockDownImplementation implements CaronaLockDown{
	
	@Override
	public void socialDistancing() {
		System.out.println("invoked social distance");
		
	}
	
	@Override
	public void wearMask() {
		System.out.println("wear mask");
		
	}
	
	@Override
	public String sanitizer() {
		System.out.println("sanitizer used is");
		return "Dettol";
	}
	
	
	public void handWash() {
		System.out.println("hand wash method");
	}

}
