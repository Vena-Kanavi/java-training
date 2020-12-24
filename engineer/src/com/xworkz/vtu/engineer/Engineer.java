package com.xworkz.vtu.engineer;

import com.xworkz.vtu.constants.Branches;

public class Engineer {
	public String USN;
	public Branches branch = Branches.MECH;
    
	/**
	 * problemSolving method for Engineering class
	 */
	public void problemSolving() {
		System.out.println("problem solved by MECH");
		//System.out.println("branch is"+this.branch);
	}
	
	/**
	 * getBranch method for getting the branch name
	 * @return branch
	 */
	
    public Branches getBranch() {
		return branch;
	}
}
