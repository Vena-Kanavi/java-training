package com.xworkz.sports;
import com.xworkz.sports.awards.Ceremony;
	public class CeremonyTester {

		public static void main(String[] args) {
	     Ceremony ceremony=new Ceremony("Award ceremony");
			
			String[] foodItems= {"Jamoon","Kaju Barfi","Ladaki Pak","Fried Rice","Mysore Pak"};
			
			ceremony.setFoods(foodItems);
			//ref
			ceremony.distributeAward("Vishalaxi", "Bharat Ratna");
			
			//ceremony.displayFoods();
			ceremony.displayCeremonyNameandFoods();
			
			ceremony.accessParentMembers();
			
			int code=ceremony.hashCode();
			System.out.println(code);
			

		}

	}


