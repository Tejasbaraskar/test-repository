package com.zensar.springbootrestfulwebservice.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
//@NamedQuery(name = "Product.productByItsName", query = "FROM Product p where p.productName=?1")
//@NamedQuery(name = "Product.productByItsCost", query = "FROM Product p where p.productCost=?1")

//@NamedQueries(value = {@NamedQuery(name = "Product.productByItsName", query = "FROM Product p where p.productName=?1"),@NamedQuery(name = "Product.productByItsCost", query = "FROM Product p where p.productCost=?1")})

//@NamedNativeQuery(name = "Product.productByItsName",query = "select * from product where name=?1",resultClass = Product.class)
public class Product implements Serializable{

	@Id
	@Column(name = "Id")
	private int productId;
	@Column(name = "name")
	private String productName;
	@Column(name = "cost")
	private int productCost;
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Product(int productId, String productName, int productCost) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productCost = productCost;
	}


	public int getProductId() {
		return productId;
	}


	public void setProductId(int productId) {
		this.productId = productId;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public int getProductCost() {
		return productCost;
	}


	public void setProductCost(int productCost) {
		this.productCost = productCost;
	}


	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productCost=" + productCost
				+ "]";
	}
	
	
	
}
