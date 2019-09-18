package com.tizzone.homeshop;

public class Customer {
	public String fullname;
	public String address;

	public Customer(String fullname, String address){
		this.fullname=fullname;
		this.address=address;
	}
	public String getFullname() {
		return fullname;
	}

	public String getAddress() {
		return address;
	}
}
