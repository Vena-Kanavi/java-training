package com.xworkz.servlet.dao;

import com.xworkz.servlet.entity.ContactEntity;

public interface ContactDAO {
	
	public void save(ContactEntity entity);
	
	public Object findByName(String name);

}
