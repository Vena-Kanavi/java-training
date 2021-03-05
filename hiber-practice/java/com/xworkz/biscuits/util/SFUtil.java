package com.xworkz.biscuits.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.xworkz.biscuits.exception.BiscuitSFCreationException;

public class SFUtil {

	private static SessionFactory factory;

	public static SessionFactory getFactory() {
		return factory;
	}

	static {
		try {
		Configuration con=new Configuration();
		con.configure();
		factory=con.buildSessionFactory();
		if(factory!=null) {
			System.out.println("session factory created");
		}else {
			throw new BiscuitSFCreationException("SF Creation exception");
		}
		}catch (Exception e) {
			throw new BiscuitSFCreationException(e.getMessage());
		}
	}

}
