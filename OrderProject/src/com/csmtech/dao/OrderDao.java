package com.csmtech.dao;

import java.util.Date;
import java.util.List;

import com.csmtech.entity.Order;

public interface OrderDao {

	List<Order> getOrders(String fDate, String sDate);
	
}
