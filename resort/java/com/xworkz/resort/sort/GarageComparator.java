package com.xworkz.resort.sort;

import java.util.Comparator;

public class GarageComparator implements Comparator<String>{
	@Override
	public int compare(String arg0, String arg1) {
		//return arg0.compareTo(arg1);//asc
		return arg1.compareTo(arg0);//desc
	}

}
