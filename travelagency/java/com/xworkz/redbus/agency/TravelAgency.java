package com.xworkz.redbus.agency;

import com.xworkz.redbus.contract.RedBusContract;

public class TravelAgency {

	private RedBusContract contract;
	private String agencyName = new String("Book My Trip");

	public TravelAgency(RedBusContract contract) {
		System.out.println("invoked travel agency");
		this.contract = contract;
	}

	public void acceptBooking() {
		System.out.println("invoked accept booking");
		System.out.println("accepted booking for " + this.agencyName);
		boolean warrenty = contract.busWarrenty();
		if (warrenty) {
			System.out.println("bus is under warrenty");
			int min = this.contract.minBooking();
			if (min > 0 && min <= 20) {
				System.out.println("can accept booking");
			} else {
				System.out.println("can not accept booking");
			}
		} else {
			System.out.println("bus is not under warrenty");
		}
	}
}
