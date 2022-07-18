package com.csmtech.runner;

import java.io.IOException;
import java.io.PrintWriter;
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
import com.csmtech.util.DButil;

public class OrderDetailsByName extends HttpServlet {
	Session session;
	Query query;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pWriter=resp.getWriter();		
		Long  pId=Long.parseLong(req.getParameter("prodId"));
		
		session=DButil.getSessionFactory().openSession();
		query=session.createQuery("from Order where prodId= "+pId);
		List<Order> orderList=query.list();
		
		
	
		 List<Ordertable> ordertableList =new ArrayList<Ordertable>(); 
		  for(Order order:orderList) 
		  { Ordertable ordertable=new Ordertable();
		   Product product =session.get(Product.class,pId);
		  ordertable.setOrderDate(order.getOrderDate());
		  ordertable.setProdName(product.getProdName());
		  ordertable.setOrderQty(order.getOrderQty());
		  ordertable.setOrderValue((product.getProdRate())*(order.getOrderQty()));
		  ordertableList.add(ordertable); 
		  req.setAttribute("ordertableList",ordertableList); 
		  req.getRequestDispatcher("./orderList.jsp").forward(req, resp);
		  }
		 
		
	}
}
