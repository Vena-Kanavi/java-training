package com.xworkz.rules;

import com.xworkz.rules.lockDown.CaronaLockDown;
import com.xworkz.rules.lockDown.LockDownImplementation;

public class LockDownTester {

	public static void main(String[] args) {
		LockDownImplementation implementation=new LockDownImplementation();
		implementation.socialDistancing();
		implementation.sanitizer();
		implementation.wearMask();
		
		CaronaLockDown lock1=new LockDownImplementation();
		lock1.sanitizer();                     //here we can not get handwash method so we need to do type casting
		
		
        CaronaLockDown imp=new LockDownImplementation();
        LockDownImplementation lock=(LockDownImplementation)imp;
        lock.handWash();
       
	}

}
