package com.csmtech.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.csmtech.entity.Order;
import com.csmtech.entity.Ordertable;
import com.csmtech.entity.Product;




public class DButil {
	private static Configuration cfg;
	private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory() {
		if(sessionFactory==null) {
			cfg=new Configuration();
			cfg.addAnnotatedClass(Order.class);
			cfg.addAnnotatedClass(Product.class);
			cfg.addAnnotatedClass(Ordertable.class);
			sessionFactory=cfg.buildSessionFactory();
			
		}
		return sessionFactory;
		
	}
}
