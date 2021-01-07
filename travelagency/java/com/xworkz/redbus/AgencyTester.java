package com.xworkz.redbus;

import com.xworkz.redbus.agency.TravelAgency;
import com.xworkz.redbus.contract.RedBusContract;
import com.xworkz.redbus.vrl.RedbusContractImplementor;

public class AgencyTester {

	public static void main(String[] args) {
		RedBusContract implement = new RedbusContractImplementor();

		TravelAgency agency = new TravelAgency(implement);

		agency.acceptBooking();
	}

}
