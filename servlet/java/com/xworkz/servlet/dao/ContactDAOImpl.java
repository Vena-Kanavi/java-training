package com.xworkz.servlet.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.servlet.entity.ContactEntity;

public class ContactDAOImpl implements ContactDAO {
	
	public ContactDAOImpl() {
	System.out.println("created  "+this.getClass().getSimpleName());
	}

	@Override
	public void save(ContactEntity entity) {
		System.out.println("invoked save");
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("com.xworkz.jpa");
		EntityManager manager=factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(entity);
		manager.getTransaction().commit();
		manager.close();
        System.out.println("saved");
	}

	@Override
	public Object findByName(String name) {
		System.out.println("invoked save");
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("com.xworkz.jpa");
		EntityManager manager=factory.createEntityManager();
		Query q=manager.createNamedQuery("findByName");
		q.setParameter("nm", name);
		Object ent=q.getSingleResult();
		return ent;
	}
	
	

}
