package com.xworkz.vtu;

import com.xworkz.vtu.exam.Exam;
import com.xworkz.vtu.exam.HallTicket;
import com.xworkz.vtu.exam.SupplementaryExam;

public class ExamTester {

	public static void main(String[] args) {
		Exam exam = new Exam();
		System.out.println(Exam.getUniversity());
		exam.setCode("15CS83");
		exam.setFees(1200);

		HallTicket hallTicket = new HallTicket("2ka16cs060", 8, "Vena");

		boolean allowed = exam.allow(hallTicket);
		if (allowed) {
			System.out.println("can write exam");
		} else {
			System.out.println("cannot write exam");
		}

		
		SupplementaryExam supplementaryExam=new SupplementaryExam();
		System.out.println(supplementaryExam.getUniversity());
		
		

	}

}
