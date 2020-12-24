package com.xworkz.vtu.engineer;

import com.xworkz.vtu.constants.Branches;

public class ISEngineer extends Engineer{
        private Branches branch=Branches.IS;
        
        public void problemSolving() {
        	super.problemSolving();
        	System.out.println("problem solved by IS");
        }
        
        public final void collectInfo() {
        	System.out.println("method using final keyword");
        }
        
        @Override
        public Branches getBranch() {
        // TODO Auto-generated method stub
        return super.getBranch();
        }
}
