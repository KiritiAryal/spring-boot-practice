package com.pack.basic.polymorphism;

public class Man extends Human{
	//@Override
	public void walk() {
		System.out.println("Man WALKS!!");
	}
	//@override
	public void age(int age) { 		//class signature needs to be same as parent's method's class signature
		System.out.println("The age of man is " + age);
	}
}
