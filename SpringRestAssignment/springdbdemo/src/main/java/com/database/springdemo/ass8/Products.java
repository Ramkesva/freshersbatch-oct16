package com.database.springdemo.ass8;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Products")
public class Products {
	
	@Id
	private int id;
	private String productName;
	private String productStatus;
	private int productCost;
	
	public Products(int id, String productName, String productStatus, int productCost) {
		super();
		this.id = id;
		this.productName = productName;
		this.productStatus = productStatus;
		this.productCost = productCost;
	}
	
	public int getId() {
		return id;
	}
	public String getProductName() {
		return productName;
	}
	public String getProductStatus() {
		return productStatus;
	}
	public int getProductCost() {
		return productCost;
	}
	@Override
	public String toString() {
		return "Admin [id=" + id + ", productName=" + productName + ", productStatus=" + productStatus
				+ ", productCost=" + productCost + "]";
	}
	

}
