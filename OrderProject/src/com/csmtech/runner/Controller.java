package com.csmtech.runner;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.csmtech.entity.Product;
import com.csmtech.util.DButil;

public class Controller extends HttpServlet {
	Session session;
	Query query;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		session=DButil.getSessionFactory().openSession();
		if(req.getServletPath().equals("/orderForm")) {
			req.getRequestDispatcher("orderForm.jsp").forward(req, resp);
		}
		
		
//		else if(req.getServletPath().equals("/getOrderList")) {
//			session=DButil.getSessionFactory().openSession();
//			query=session.createQuery("from Product");
//			List<Product> productList=query.list();
////			PrintWriter pWriter=resp.getWriter();
////			pWriter.println(productList);
//			req.setAttribute("productList", productList);
//			req.getRequestDispatcher("orderList.jsp").forward(req, resp);
//		}
	}
}
