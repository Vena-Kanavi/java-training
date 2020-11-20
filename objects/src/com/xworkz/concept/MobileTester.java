package com.xworkz.concept;
import com.xworkz.concept.obj.Mobile;

public class MobileTester {
	public static void main(String args[]) {
		Mobile.yom="2020";
		System.out.println("mobile data");
		Mobile mobile=new Mobile();
		mobile.model="Realme";
		mobile.color="Blue";
		mobile.battery="4230mAh";
		mobile.memory="3GB";
		mobile.displayInfo();
		System.out.println("*****************");
        
		Mobile mobile2=new Mobile();
		mobile2.model="Nokia";
		mobile2.color="Black";
		mobile2.battery="3000mAh";
		mobile2.memory="4GB";
		mobile2.displayInfo();
		System.out.println("************************");
		
		Mobile mobile3=new Mobile();
		mobile3.model="Samsung";
		mobile3.color="Gold";
		mobile3.battery="2630mAh";
		mobile3.memory="3GB";
		mobile3.displayInfo();
		System.out.println("****************************");
		
		Mobile mobile4=new Mobile();
		mobile4.model="Redme";
		mobile4.color="Silver";
		mobile4.battery="5000mAh";
		mobile4.memory="3GB";
		mobile4.displayInfo();
		System.out.println("*****************************");
		
		Mobile mobile5=new Mobile();
		mobile5.model="Jio";
		mobile5.color="Red";
		mobile5.battery="4000mAh";
		mobile5.memory="3GB";
		mobile5.displayInfo();
	}

}
