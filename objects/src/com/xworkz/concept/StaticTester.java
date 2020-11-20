package com.xworkz.concept;

import com.xworkz.concept.staticproblem.Person;

public class StaticTester {

		public static void main(String[] args) {
		
			Person.name="Hritik Roshan";
			Person.address="Mumbai";
			Person.dob="10/01/1974";
			Person.displayInfo();
			
			System.out.println("********************************");
			
			Person.name="Tiger Shroff";
			Person.address="Mumbai";
			Person.dob="02/03/1990";
			Person.displayInfo();
			
		}

	}

