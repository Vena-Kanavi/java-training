package com.xworkz.data.transfer;
import com.xworkz.data.dto.ICUAdmissionDTO;

public class ICU {
	private boolean ventilator;
	private int price;
	private boolean tvAvailable;
	private ICUAdmissionDTO admissionDTO;
	
	public ICU() {
		System.out.println("invoked Default constructor");
	}
	public ICU(boolean ventilator,int price,boolean tvAvailable) {
		this.ventilator=ventilator;
		this.price=price;
		this.tvAvailable=tvAvailable;
	}
	public void admissionDetails(String name,String severity,String doctorAssigned,String nurseAssigned) {
		this.admissionDTO=new ICUAdmissionDTO(name,severity,doctorAssigned,nurseAssigned);
	}
	
	
	public void updateDoctor(String newDoctorName) {
		this.admissionDTO.setDoctorName("Vidya");
	}
	public ICUAdmissionDTO getAdmissionDTO() {
		return admissionDTO;
	}

	

}
