package com.xworkz.data;

import com.xworkz.data.dto.ICUAdmissionDTO;
import com.xworkz.data.transfer.ICU;


public class ICUTester {

	public static void main(String[] args) {
        ICU icu = new ICU(true,2000,true);
		
		icu.admissionDetails("Bhuvi","Eye Sight","Vijay","Kasturi");		
		ICUAdmissionDTO admissionDTO=icu.getAdmissionDTO();
		System.out.println("patient name " +admissionDTO.getPatientName());
		System.out.println("doctor assigned "+admissionDTO.getDoctorName());
		System.out.println("severity "+admissionDTO.getSeverity());
		System.out.println("nurse assigned "+admissionDTO.getNurseAssigned());
		icu.updateDoctor("Vidya");
		System.out.println("updated doctor name "+admissionDTO.getDoctorName());
               
	}

}
