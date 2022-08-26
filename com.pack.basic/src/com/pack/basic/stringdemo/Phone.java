package com.pack.basic.stringdemo;

public class Phone {
	
	private String name;
	private int price;
	
	public Phone() {
		
	}
	
	public Phone(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public void print() {
		System.out.println("The brand of phone is " + name);
		System.out.println("The price of the phone is " + price);
	}
}
