package com.xworkz.resort.sort;

import java.util.Comparator;

import com.xworkz.resort.dto.BeachDTO;

public class BeachNoOfResortsComparator implements Comparator<BeachDTO>{

	@Override
	public int compare(BeachDTO o1, BeachDTO o2) {
		Integer oNo1=o1.getNoOfResorts();
		Integer oNo2=o2.getNoOfResorts();
		return oNo1.compareTo(oNo2);
	}

}
