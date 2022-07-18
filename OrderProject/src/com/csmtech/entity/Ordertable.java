package com.csmtech.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "order_list")
public class Ordertable implements Serializable {
	@Id
	@Column(name = "sl_no")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer sl;
	@Column(name = "product_name")
	private String prodName;
	@Column(name = "order_date")
	private Date orderDate;
	@Column(name = "order_qty")
	private Long orderQty;
	@Column(name = "order_value")
	private Double orderValue;
	public Integer getSl() {
		return sl;
	}
	public void setSl(Integer sl) {
		this.sl = sl;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public Long getOrderQty() {
		return orderQty;
	}
	public void setOrderQty(Long orderQty) {
		this.orderQty = orderQty;
	}
	public Double getOrderValue() {
		return orderValue;
	}
	public void setOrderValue(Double orderValue) {
		this.orderValue = orderValue;
	}
	@Override
	public String toString() {
		return "Ordertable [sl=" + sl + ", prodName=" + prodName + ", orderDate=" + orderDate + ", orderQty=" + orderQty
				+ ", orderValue=" + orderValue + "]";
	}
	
	
}
