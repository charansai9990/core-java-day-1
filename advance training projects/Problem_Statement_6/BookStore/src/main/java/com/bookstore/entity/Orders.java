package com.bookstore.entity;

import java.sql.Timestamp;

public class Orders {
	
	int Order_Id;
	String Address;
	int Phone_No;
	String Cust_Name;
	Timestamp Book_Id;
	int Quantity;
	
	public Orders(String address, int mobileno, String name) {
		super();
		this.Address = address;
		this.Phone_No = mobileno;
		this.Cust_Name = name;
	}
	public Orders(int order_id, String address, int mobileno, String name,int quantity) {
		super();
		this.Order_Id = order_id;
		this.Address = address;
		this.Phone_No = mobileno;
		this.Cust_Name = name;
		this.Quantity = quantity;
	}

	
	public int getOrder_Id() {
		return Order_Id;
	}
	public void setOrder_Id(int order_Id) {
		Order_Id = order_Id;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public int getPhone_No() {
		return Phone_No;
	}
	public void setPhone_No(int phone_No) {
		Phone_No = phone_No;
	}
	public String getCust_Name() {
		return Cust_Name;
	}
	public void setCust_Name(String cust_Name) {
		Cust_Name = cust_Name;
	}
	
	public Timestamp getBook_Id() {
		return Book_Id;
	}
	public void setBook_Id(Timestamp book_Id) {
		Book_Id = book_Id;
	}

	
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	@Override
	public String toString() {
		return "Orders [order_id=" + Order_Id + ", address=" + Address + ", mobileno=" + Phone_No + ", name=" + Cust_Name
				+ ", orderdate=" + Book_Id + ", quantity=" + Quantity + "]";
	}

	
	

}
