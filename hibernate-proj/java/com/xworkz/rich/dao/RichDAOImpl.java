package com.xworkz.rich.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.rich.entity.RichEntity;

public class RichDAOImpl implements RichDAO {
	
	public RichDAOImpl() {
		System.out.println("invoked RichDAOImpl");
	}

	@Override
	public void create(RichEntity entity) {
		System.out.println("invoked create method");
		System.out.println("entity: "+entity);
		
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(RichEntity.class);
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(entity);
		transaction.commit();
		session.close();
		sessionFactory.close();

	}

}
