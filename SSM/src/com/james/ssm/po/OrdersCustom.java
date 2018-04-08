package com.james.ssm.po;

public class OrdersCustom extends Orders {
	private String address;
	private String username;
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
}
