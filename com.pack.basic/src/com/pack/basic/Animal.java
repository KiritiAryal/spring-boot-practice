package com.pack.basic;

public class Animal {
	public void eat() {
		System.out.println("animal is eating!!");
	}
	
	private void sleep() {				// not visible outside the class
		System.out.println("animal is sleeping");
	}
	
	public String name = "Tigora";
	private int age = 100;
	
}