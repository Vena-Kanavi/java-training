package com.xworkz.incomplete;

import com.xworkz.incomplete.inherit.RawMaterial;
import com.xworkz.incomplete.states.AluminiumRawMaterial;
import com.xworkz.incomplete.states.CopperRawMaterial;


public class RawMaterialTester {

	public static void main(String[] args) {
		RawMaterial material=new AluminiumRawMaterial();
		material.delivery();
		material.manufacture();
		
		
		RawMaterial material2=new CopperRawMaterial();
		material2.manufacture();

	}

}
