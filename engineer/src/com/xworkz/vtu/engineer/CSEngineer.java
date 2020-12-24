package com.xworkz.vtu.engineer;

import com.xworkz.vtu.constants.Branches;

public class CSEngineer extends Engineer{
	private Branches branch=Branches.CS;

	public void problemSolving() {
		super.problemSolving();
		System.out.println("problem solved by CS");
		//System.out.println("branch is"+this.branch);
	}
	
	/**
	 * getBranch method for getting current branch name
	 * @return branch
	 */
	
	public Branches getBranch() {
		return branch;
	}
	
	/**
	 * getParentBranch method for getting branch name of Parent
	 * @return branch
	 */
	
	
	public Branches getParentBranch() {
		
		return super.branch;
	}
}
