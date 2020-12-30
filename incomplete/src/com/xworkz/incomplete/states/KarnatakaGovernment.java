package com.xworkz.incomplete.states;

import com.xworkz.incomplete.inherit.UnionGovernment;

public class KarnatakaGovernment extends UnionGovernment{
	
	
	public KarnatakaGovernment() {
		
		String scheme=super.scheme;
		System.out.println("invoked state government");
	}
	
	@Override
	public void skillIndia() {
		System.out.println("overriden method");
		
	}

}
