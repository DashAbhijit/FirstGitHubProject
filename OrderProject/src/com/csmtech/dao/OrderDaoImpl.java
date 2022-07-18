package com.csmtech.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.csmtech.entity.Order;
import com.csmtech.entity.Ordertable;
import com.csmtech.entity.Product;
import com.csmtech.util.DButil;

public class OrderDaoImpl implements OrderDao {
	Session session;
	Query query;
	
	@Override
	public List<Order> getOrders(String fDate, String sDate) {
		session=DButil.getSessionFactory().openSession();
		query=session.createQuery("from Order where orderDate between '"+ fDate+"' and '"+ sDate+"'");
		List<Order> orderList=query.list();
		return orderList;
	}

	
}
