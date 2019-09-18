package com.tizzone.homeshop;

public class Product {
	private String name;
	private String description;
	private double price;

	/**
	 * Display a complete description of teh product
	 */
	public void look(){
		System.out.println(String.format(name + " : " + "%n" + description));
	}

	/**
	 * Add the product to a bill
	 */
	public void buy(Bill bill, Integer quantity){

	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(final double price) {
		this.price = price;
	}
}
