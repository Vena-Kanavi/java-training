package com.xworkz.event.custom;

public class ExceptionThrower {
	
	public void checked() throws CustomCheckedException {

		throw new CustomCheckedException("this is testing checked");

	}

	public void unchecked() {

		throw new CustomUncheckedException("testing unchecked");
	}


}
