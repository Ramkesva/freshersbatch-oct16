package com.database.springdbdemo.ass7;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Orders {
	
	@Id
	private int orderid;
	private String ordername;
	
	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Orders(int orderid, String ordername) {
		super();
		this.orderid = orderid;
		this.ordername = ordername;
	}
	public int getOrderid() {
		return orderid;
	}
	public String getOrdername() {
		return ordername;
	}
	@Override
	public String toString() {
		return "Orders [orderid=" + orderid + ", ordername=" + ordername + "]";
	}

}
