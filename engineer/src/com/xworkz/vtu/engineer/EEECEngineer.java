package com.xworkz.vtu.engineer;

import com.xworkz.vtu.constants.Branches;

public class EEECEngineer extends ECEngineer{
	
	private Branches branch=Branches.EEE;
	
	public void problemSolving() {
		
		super.problemSolving();
		System.out.println("problem solved by EE");
		//System.out.println("branch is"+this.branch);
	}
	public Branches getBranch() {
		return branch;
	}
	public Branches getParentBranch() {
		
		return super.branch;
	}
}
