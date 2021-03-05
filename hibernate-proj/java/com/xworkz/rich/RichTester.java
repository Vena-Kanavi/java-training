package com.xworkz.rich;

import com.xworkz.rich.dao.RichDAO;
import com.xworkz.rich.dao.RichDAOImpl;
import com.xworkz.rich.entity.RichEntity;

public class RichTester {

	public static void main(String[] args) {
		
		RichEntity entity=new RichEntity();
		entity.setId(4);
		entity.setName("Bill Gates");
		entity.setCountry("USA");
		entity.setNetWorthInBillions(133);
		entity.setMarried(true);
		entity.setBusiness("Software");
		entity.setRank(3);		
		
		RichDAO dao=new RichDAOImpl();
		dao.create(entity);
		
		RichEntity entity1=new RichEntity();
		entity1.setId(5);
		entity1.setName("Elon Musk");
		entity1.setCountry("South Africa");
		entity1.setNetWorthInBillions(197);
		entity1.setMarried(true);
		entity1.setBusiness("Tesla");
		entity1.setRank(1);		
		
		RichDAO dao1=new RichDAOImpl();
		dao1.create(entity1);
		
		
		
		

	}

}
