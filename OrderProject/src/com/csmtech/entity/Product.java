package com.csmtech.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name ="product_master" )
public class Product implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "prod_id")
	private Long prodId;
	@Column(name = "prod_name")
	private String prodName;
	@Column(name = "prod_rate")
	private Double prodRate;
	@Column(name = "prod_qty")
	private Long prodQty;
	public Long getProdId() {
		return prodId;
	}
	public void setProdId(Long prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public Double getProdRate() {
		return prodRate;
	}
	public void setProdRate(Double prodRate) {
		this.prodRate = prodRate;
	}
	public Long getProdQty() {
		return prodQty;
	}
	public void setProdQty(Long prodQty) {
		this.prodQty = prodQty;
	}
	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + ", prodRate=" + prodRate + ", prodQty="
				+ prodQty + "]";
	}
	
}
