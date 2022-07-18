package com.csmtech.service;

import java.util.Date;
import java.util.List;

import com.csmtech.entity.Order;

public interface OrderService {

	List<Order> getOrders(String fDate, String sDate);
	
}
