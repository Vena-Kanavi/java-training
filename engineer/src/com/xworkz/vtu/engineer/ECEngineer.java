package com.xworkz.vtu.engineer;

import com.xworkz.vtu.constants.Branches;

public class ECEngineer extends Engineer{
     public Branches branch=Branches.EC;
     public void problemSolving() {
 		System.out.println("problem solved by EC");
 		//System.out.println("branch is"+this.branch);
 	}
     
     public final void electricWork() {
    	 System.out.println("electric work method");
     }
     
 	public Branches getBranch() {
 		return branch;
 	}
 	
 	public Branches getParentBranch() {
 		return super.branch;
 	}
 	
}
