package com.xworkz.servlet.service;

import com.xworkz.servlet.dao.ContactDAO;
import com.xworkz.servlet.entity.ContactEntity;

public class ContactServiceImpl implements ContactService<ContactEntity> {
	
	private ContactDAO dao;
	
	public ContactServiceImpl(ContactDAO dao) {
	System.out.println("created "+this.getClass().getSimpleName());
	this.dao=dao;
	}
	
	@Override
	public boolean validateAndSave(ContactEntity entity) {
		System.out.println("invoked validateAndSave");
		System.out.println("entity "+entity);
		boolean valid=true;
		if(entity!=null) {
			System.out.println("can add entity");
			if(valid) {
				String name=entity.getName();
				if(name!=null && !name.isEmpty() && name.length()>3 && name.length()<20) {
					System.out.println("name is valid");
					valid=true;
				}else {
					System.out.println("name is invalid");
					valid=false;
				}
			}
			if(valid) {
				String email=entity.getEmail();
				if(email!=null && !email.isEmpty() && email.contains("@") && email.endsWith(".com")) {
					System.out.println("email is valid");
					valid=true;
				}else {
					System.out.println("email is invalid");
					valid=false;
				}
			}
			if(valid) {
				String company=entity.getCompany();
				if(company!=null && !company.isEmpty() && company.length()>3 && company.length()<15) {
					System.out.println("company is valid");
					valid=true;
				}else {
					System.out.println("company is invalid");
					valid=false;
				}
			}
			if(valid) {
				String about=entity.getAbout();
				if(about!=null && !about.isEmpty()) {
					System.out.println("about is valid");
					valid=true;
				}else {
					System.out.println("about is invalid");
					valid=false;
				}
			}
			
			if(valid) {
				String phone=entity.getPhone();
				if(phone!=null && !phone.isEmpty() && phone.length()>0 && phone.length()<=10) {
					System.out.println("phone no is valid");
					valid=true;
				}else {
					System.out.println("phone no is invalid");
					valid=false;
				}
			}
			
		}
		else {
			System.out.println("can not add entity");
		}
		
		
		return valid;
	}
	
	@Override
	public Object searchByName(String name) {
		System.out.println("invoked searchByName");
		if(name!=null && !name.isEmpty() && name.length()>3 && name.length()<25) {
			System.out.println("name is valid");
			Object entity=this.dao.findByName(name);
			System.out.println("entity fount  "+entity);
			return entity;
		}else {
			System.out.println("name is not valid");
		}
		return null;
	}

}
