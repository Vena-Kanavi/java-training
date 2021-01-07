package com.xworkz.redbus.vrl;

import com.xworkz.redbus.contract.RedBusContract;

public class RedbusContractImplementor implements RedBusContract {

	@Override
	public int minBooking() {
		System.out.println("invoked min booking method");
		return 20;
	}

	@Override
	public boolean busWarrenty() {
		System.out.println("invoked bus warrenty");
		return true;
	}

}
