package com.xworkz.data.transfer;
import com.xworkz.data.dto.ManagerDTO;

public class CarShowRoom {
	
		private String name;
		private String location;
		private ManagerDTO managerDTO;
		
		
		public CarShowRoom() {
			System.out.println("CarShowRoom default constructor");
		}


		public CarShowRoom(String name, String location) {
			super();
			this.name = name;
			this.setLocation(location);
		}
		
		public void addManager(String name,long contactNo) {
			if(name!=null && contactNo>0) {
				this.managerDTO=new ManagerDTO(name,contactNo);
				System.out.println("manager added, data is valid");
			} else {
				System.out.println("provide proper details,data is invalid");
			}
		}
		
		public void addManager(ManagerDTO dto) {
			if(dto!=null) {
				this.managerDTO=dto;
				System.out.println("manager added");
			} else {
				System.out.println("manager not added, data is invalid");
			}
		}
		
		public void displayManager() {
			if(this.managerDTO!=null) {
				System.out.println(this.managerDTO.getName());
				System.out.println(this.managerDTO.getContactNo());
			} else {
				System.out.println("manager is not there :: null");
			}
		}
		
		public void removeManager() {
			this.managerDTO=null;
		}
		
		public void updateManager(long contactNo) {
			if(contactNo>0 && this.managerDTO!=null) {
				this.managerDTO.setContactNo(contactNo);
				System.out.println("details are valid, updated contact number");
			} else {
				System.out.println("cannot update contact number,data is invalid");
			}
			
		}
		public void updateManager(String name) {
			if(name!=null && this.managerDTO!=null) {
				this.managerDTO.setName(name);
				System.out.println("details are valid, updated name");
			} else {
				System.out.println("cannot update name,data is invalid");
			}
		}


		public String getName() {
			return name;
		}


		public String getLocation() {
			return location;
		}


		public void setLocation(String location) {
			this.location = location;
		}
	
}
