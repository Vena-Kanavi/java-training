package com.xworkz.fileDTO.file;
import java.util.Date;

/**
 * @author VENA
 *
 */
public class FileDTO {
	private String name;
	private String location;
	private String type;
	private double size;
	private Date currentDate;
	
	public FileDTO() {
		System.out.println("invoked default constructor");
	}
	
	public FileDTO(String name,double size) {
		System.out.println("parameterized constructor");
		this.name=name;
		this.size=size;
	}
	public FileDTO(String name,String location,String type,double size,Date currentDate) {
		this.name=name;
		this.location=location;
		this.type=type;
		this.currentDate=currentDate;
		this.size=size;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public Date getCurrentDate() {
		return currentDate;
	}

	public void setCurrentDate(Date currentDate) {
		this.currentDate = currentDate;
	}
	
	

}
