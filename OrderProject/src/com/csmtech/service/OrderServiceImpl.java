package com.csmtech.service;

import java.util.Date;
import java.util.List;

import com.csmtech.dao.OrderDao;
import com.csmtech.dao.OrderDaoImpl;
import com.csmtech.entity.Order;

public class OrderServiceImpl implements OrderService {

	

	@Override
	public List<Order> getOrders(String fDate, String sDate) {
		OrderDao orderDao=new OrderDaoImpl();
		return orderDao.getOrders(fDate,sDate);
	}

	

}
