package com.csmtech.runner;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.csmtech.entity.Product;
import com.csmtech.util.DButil;

public class ButtonAction extends HttpServlet {
	Session session;
	Query query;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		  PrintWriter pWriter=resp.getWriter();
		 
		session=DButil.getSessionFactory().openSession();
		query=session.createQuery("from Product");
		List<Product> productList=query.list();
		req.setAttribute("productList", productList);
		req.getRequestDispatcher("./orderList.jsp").forward(req, resp);
	}
}
