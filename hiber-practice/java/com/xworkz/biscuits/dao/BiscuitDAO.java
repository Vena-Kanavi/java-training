package com.xworkz.biscuits.dao;

import java.util.List;

import com.xworkz.biscuits.entity.BiscuitEntity;

public interface BiscuitDAO {

	public void create(BiscuitEntity entity);
	
	public BiscuitEntity getById(int id);
	
	public void updatePriceById(int id,int price);
	
	public void deleteById(int id);
	
	public void createAll(List<BiscuitEntity> entities);
	
	public List<BiscuitEntity> getAll();
	
}
