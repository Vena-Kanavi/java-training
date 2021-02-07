package com.xworkz.celebration.service;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.celebration.functional.Display;

public class DisplayServiceImpl implements DisplayService{

	private List<String> names;
	
	public DisplayServiceImpl() {
		this.names=new ArrayList<String>();
		this.names.add("Steve Jobs");
		this.names.add("Aryabhata");
		this.names.add("APJ Abdul Kalam");
		this.names.add("Ramanujan");
	}

	@Override
	public void printString(Display display) {
		System.out.println("invoked print string");
		for (String string : names) {
			display.print(string);
		}
		
	}
	
	
	
}
