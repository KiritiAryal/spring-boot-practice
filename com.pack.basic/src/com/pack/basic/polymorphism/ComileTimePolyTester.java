package com.pack.basic.polymorphism;

public class ComileTimePolyTester {
	
	public static void main(String[] args) {
		Laptop laptop = new Laptop();
		laptop.hdd();
		laptop.hdd(5);
		laptop.hdd("My Passport");
		laptop.hdd("MyPassport1", 10);
	}

}