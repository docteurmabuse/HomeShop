package com.tizzone.homeshop;

import java.util.HashMap;
import java.util.Map;

public class Bill {
	private Customer customer;
	private Map<Product, Integer> products = new HashMap<Product, Integer>();
	private Delivery delivery;

	public Bill(Customer customer, Delivery delivery) {
		this.customer = customer;
		this.delivery = delivery;
	}

	public void addProduct(Product product, int quantity) {
		this.products.put(product, quantity);
	}

	public Customer getClient() {
		return customer;
	}

	public Map<Product, Integer> getProducts() {
		return products;
	}
}
