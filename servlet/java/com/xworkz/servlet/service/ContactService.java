package com.xworkz.servlet.service;

public interface ContactService<T> {

	public boolean validateAndSave(T entity);
	
	public Object searchByName(String name);
	
}
