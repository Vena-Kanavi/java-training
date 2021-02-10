package com.xworkz.solution;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MobileNumberTester {

	public static void main(String[] args) {
		Collection<Long> mobileNumber=new ArrayList();
		mobileNumber.add(7829731400l);
		mobileNumber.add(7975459050l);
		mobileNumber.add(7204672052l);
		mobileNumber.add(9902848325l);
		mobileNumber.add(9980297429l);
		mobileNumber.add(9945413152l);
		mobileNumber.add(7353848688l);
		mobileNumber.add(9845474910l);
		mobileNumber.add(7829731444l);
		mobileNumber.add(7829731456l);
		
		int totalNo=mobileNumber.size();
		System.out.println("Total Mobile numbers "+totalNo);
		
		for(Long mobileNo: mobileNumber) {
			String convertedNo=mobileNo.toString();
			Character last=convertedNo.charAt(convertedNo.length()-1);
			//System.out.println(last);
			if(Integer.parseInt(last.toString())>3) {
				System.out.println("mobile number greater than 3 "+convertedNo);
				System.out.println(last);
			}
		}
	}

}
