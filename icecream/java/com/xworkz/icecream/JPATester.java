package com.xworkz.icecream;

import com.xworkz.icecream.entity.IceCreamEntity;
import com.xworkz.icecream.entity.IceCreamEntity.Color;
import com.xworkz.icecream.entity.IceCreamEntity.Flavour;
import com.xworkz.icecream.repository.IceCreamRepository;
import com.xworkz.icecream.repository.IceCreamRepositoryImpl;

public class JPATester {

	public static void main(String[] args) {
		
		IceCreamEntity entity=new IceCreamEntity();
		entity.setId(1);
		entity.setName("Honey Moon");
		entity.setCompany("Baskin Robin");
		entity.setFlavour(Flavour.MIXED);
		entity.setColor(Color.MIXED);
		entity.setPrice(300);
		
		IceCreamRepository repository=new IceCreamRepositoryImpl();
		repository.persist(entity);

	}

}
