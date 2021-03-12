package com.xworkz.icecream.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import com.xworkz.entityManagerFactory.util.EMFUtil;
import com.xworkz.icecream.entity.IceCreamEntity;

public class IceCreamRepositoryImpl implements IceCreamRepository {
	
	private EntityManagerFactory factory=EMFUtil.getFactory();
	
	@Override
	public void persist(IceCreamEntity entity) {
		EntityManager manager=null;
		try {
		manager=factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(entity);
		manager.getTransaction().commit();
		manager.close();
		}catch (Exception e) {
	        e.printStackTrace();
	        manager.getTransaction().rollback();
		}
	}

	@Override
	public void deleteByName(String name) {
		EntityManager manager=null;
		try {
		manager=factory.createEntityManager();
		manager.getTransaction().begin();
		Query q=manager.createNamedQuery("deleteByName");
		q.setParameter("nm", name);
		q.executeUpdate();
		manager.getTransaction().commit();
		}finally {
			manager.close();
		}
		
	}

	@Override
	public void updatePriceByName(String name, double price) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<IceCreamEntity> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IceCreamEntity findByNameAndPrice(String name, double price) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IceCreamEntity getMaxPrice() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IceCreamEntity getMinPrice() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double getBySumPrice() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double getPriceByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object[]> getNameAndFlavourByPrice(double price) {
		// TODO Auto-generated method stub
		return null;
	}

}
