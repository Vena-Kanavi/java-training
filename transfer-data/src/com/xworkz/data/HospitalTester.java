package com.xworkz.data;
import com.xworkz.data.transfer.Hospital;
import com.xworkz.data.transfer.AppointmentDTO;

public class HospitalTester {

	public static void main(String[] args) {
		Hospital hospital=new Hospital("Victory","City Market");
		
		hospital.appointment("Ganga", 9845474910l, 87, "Nerve problem", "Dr.Vidya");
		
		AppointmentDTO appointment=hospital.getAppointmentDTO();
		System.out.println("patient name " +appointment.getPatientName());
		System.out.println("mobile number "+appointment.getMobileNumber());
		System.out.println("doctor name "+appointment.getDoctorName());
		

	}

}
