package com.xworkz.vtu;

import com.xworkz.vtu.engineer.CSEngineer;
import com.xworkz.vtu.engineer.ECEngineer;
import com.xworkz.vtu.engineer.EEECEngineer;
import com.xworkz.vtu.engineer.Engineer;
import com.xworkz.vtu.engineer.ISEngineer;
import com.xworkz.vtu.engineer.ITCSEngineer;

public class EngineerTester {

	public static void main(String[] args) {
		/**
		 * creating object of Engineer class and retrieving all the variables and methods using ref
		 */
		
        Engineer engineer=new Engineer();
        System.out.println(engineer.USN);
        System.out.println("parent branch"+engineer.getBranch());
        engineer.problemSolving();
        
        
        /**
         * creating object of CSEngineer class and retrieving all the variables and methods using ref
         */
        
        
        CSEngineer csEngineer=new CSEngineer();
        System.out.println(csEngineer.USN);
        System.out.println(csEngineer.getBranch());
        System.out.println("parent branch "+csEngineer.getParentBranch());
        csEngineer.problemSolving();
        
        /**
         * creating object of child CSEngineer using parent Engineer
         * By using ref of parent displaying the methods and values of variable
         * problemSolving() method returns the value of child i.e, CSEngineer
         * getBranch returns the branch name of parent
         */
        
        Engineer engineer2=new CSEngineer();
        engineer2.problemSolving();
        System.out.println(engineer2.getBranch());
        
        /**
         * creating object of child ISEngineer using parent Engineer
         * By using ref of parent displaying the methods and values of variable
         * problemSolving() method returns the value of child i.e, ISEngineer
         * getBranch returns the branch name of parent
         */
        
        Engineer engineer3=new ISEngineer();
        engineer3.problemSolving();
        System.out.println(engineer3.getBranch());
        
        /**
         * creating object of ISEngineer class and calling the final method collectInfo
         */
        ISEngineer isEngineer=new ISEngineer();
        isEngineer.collectInfo();
        
        /**
         * creating object of child ITCSEngineer using parent Engineer
         * By using ref of parent displaying the methods and values of variable
         * problemSolving() method returns the value of child i.e, ITCSEngineer
         * getBranch returns the branch name of parent
         */
        
        
        Engineer engineer4=new ITCSEngineer();
        engineer4.problemSolving();
        System.out.println(engineer4.getBranch());
        
        /**
		 * creating object of ECEngineer class and retrieving all the variables and methods using ref
		 */
        
        
        ECEngineer engineer5=new ECEngineer();
        engineer5.problemSolving();
        System.out.println(engineer5.getParentBranch());
        engineer5.electricWork();
        
        /**
		 * creating object of EEECEngineer class and retrieving all the variables and methods using ref
		 */
        EEECEngineer eeecEngineer=new EEECEngineer();
        eeecEngineer.problemSolving();
        System.out.println(eeecEngineer.getBranch());
        System.out.println(eeecEngineer.getParentBranch());
        eeecEngineer.electricWork();
        
	}

}
