package com.xworkz.biscuits.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.biscuits.entity.BiscuitEntity;
import com.xworkz.biscuits.util.SFUtil;

public class BiscuitDAOImpl implements BiscuitDAO {

	private SessionFactory factory = SFUtil.getFactory();
	
	private List<BiscuitEntity> lists;
	
	public BiscuitDAOImpl() {
		
	}
	
	public BiscuitDAOImpl(List<BiscuitEntity> lists) {
		this.lists=lists;
	}

	@Override
	public void create(BiscuitEntity entity) {
		System.out.println("invoked create");
		System.out.println("entity: " + entity);
		try (Session session = factory.openSession()) {
			Transaction tr = session.beginTransaction();
			session.save(entity);
			tr.commit();
		}

	}

	@Override
	public BiscuitEntity getById(int id) {
		System.out.println("invoked getById");
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		BiscuitEntity entityFromDB = session.get(BiscuitEntity.class, id);
		tr.commit();
		return entityFromDB;
	}

	@Override
	public void updatePriceById(int id, int price) {
		System.out.println("invoked updatePriceById");
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		BiscuitEntity entityFromDB = session.get(BiscuitEntity.class, id);
		if (entityFromDB != null) {
			entityFromDB.setPrice(price);
			session.update(entityFromDB);
			tr.commit();
		}

	}

	@Override
	public void deleteById(int id) {
		System.out.println("invoked deleteById");
		try (Session session = factory.openSession()) {
			Transaction tr = session.beginTransaction();
			BiscuitEntity entityFromDB = session.get(BiscuitEntity.class, id);
			if (entityFromDB != null) {
				session.delete(entityFromDB);
				tr.commit();
			}
		}
	}

	@Override
	public void createAll(List<BiscuitEntity> entities) {
		System.out.println("invoked createAll");
		System.out.println("entities: " + entities);
		int count = 0;
		Transaction tr = null;
		try {
			Session session = factory.openSession();
			tr = session.beginTransaction();
			for (BiscuitEntity biscuitEntity : entities) {
				session.save(biscuitEntity);
				count++;
				if (count == 3) {
					session.flush();
					count = 0;
					System.out.println("flushed");
				}

			}
			tr.commit();
			session.close();
		} catch (HibernateException e) {
			e.printStackTrace();
			tr.rollback();
		}
	}

	@Override
	public List<BiscuitEntity> getAll() {
	    System.out.println("invoked getAll");
		return this.lists;
	}

}
