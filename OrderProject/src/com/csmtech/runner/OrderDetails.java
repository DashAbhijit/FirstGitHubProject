package com.csmtech.runner;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.csmtech.entity.Order;
import com.csmtech.entity.Ordertable;
import com.csmtech.entity.Product;
import com.csmtech.service.OrderService;
import com.csmtech.service.OrderServiceImpl;
import com.csmtech.util.DButil;

public class OrderDetails extends HttpServlet {
	Session session;
	Query query;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		String fDate=req.getParameter("fDate");
		String sDate=req.getParameter("sDate");
		
		OrderService orderService=new OrderServiceImpl();
		List<Order> orderList=orderService.getOrders(fDate,sDate);
		
		session=DButil.getSessionFactory().openSession();
		List<Ordertable> ordertableList = null;
		ordertableList=new ArrayList<Ordertable>();
		for(Order order:orderList) {
			Ordertable ordertable=new Ordertable();
			Product product=session.get(Product.class, order.getProdId());
			ordertable.setOrderDate(order.getOrderDate());
			ordertable.setProdName(product.getProdName());
			ordertable.setOrderQty(order.getOrderQty());
			ordertable.setOrderValue((product.getProdRate())*(order.getOrderQty()));
			ordertableList.add(ordertable);
		}
		
		req.setAttribute("ordertableList", ordertableList);
		req.getRequestDispatcher("./orderForm.jsp").forward(req, resp);
	}
}
