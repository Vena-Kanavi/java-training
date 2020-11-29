package com.xworkz.constructor;
import com.xworkz.constructor.examples.Country;
public class CountryTester {

		public static void main(String[] args) {
			String color="4";
			byte num=Byte.parseByte(color);
			String states="28";
			byte num1=Byte.parseByte(states);
			String republicYear="1947";
			short num2=Short.parseShort(republicYear);
			
			
			Country country=new Country("India","india.gov.in",num,num1,"Naremdra Modi","Hockey",num2,"Peacock");
            
		}

	}

