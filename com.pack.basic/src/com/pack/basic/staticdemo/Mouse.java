package com.pack.basic.staticdemo;

public class Mouse {
	
	int price;
	
	public Mouse() {
		System.out.println("default constructor of mouse class");
	}
	
	public static void type() {
		System.out.println("wired mouse");;	
	}
	public static void print() {
		System.out.println("Hey!");
	}
	public void price(int mousePrice) {
		price = mousePrice;
		System.out.println("Price of mouse is " + price);
	}
}
