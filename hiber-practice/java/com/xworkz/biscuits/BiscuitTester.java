package com.xworkz.biscuits;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.biscuits.dao.BiscuitDAO;
import com.xworkz.biscuits.dao.BiscuitDAOImpl;
import com.xworkz.biscuits.entity.BiscuitEntity;

public class BiscuitTester {

	public static void main(String[] args) {
		BiscuitEntity entity=new BiscuitEntity("MarieGold", "Sunfeast", "Sweet", "Round", 15);
		
		BiscuitEntity entity1=new BiscuitEntity("50-50", "Britannia", "Salt", "Square", 10);
		
		BiscuitEntity entity2=new BiscuitEntity("Bourbon", "Britannia", "Cream", "Rectangle", 20);
		
		BiscuitEntity entity3=new BiscuitEntity("Dark Fantacy", "Sunfeast", "Cream", "Round", 30);
		
		BiscuitEntity entity4=new BiscuitEntity("Oreo", "Cadberry", "Cream", "Round", 10);
		
		List<BiscuitEntity> entities=new ArrayList<BiscuitEntity>();
	    entities.add(entity);
	    entities.add(entity1);
	    entities.add(entity2);
	    entities.add(entity3);
	    entities.add(entity4);
		
		
		BiscuitDAO dao=new BiscuitDAOImpl();
		dao.create(entity2);
		
		dao.createAll(entities);
		
		dao.getById(4);
		
		dao.deleteById(2);
		
		dao.updatePriceById(3, 35);
		
		
//		BiscuitDAO dao1=new BiscuitDAOImpl(entities);
//		System.out.println(dao1.getAll());

	}

}
