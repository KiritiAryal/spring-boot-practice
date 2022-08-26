package com.kiriti;

public class Person {
	static {
		System.out.println("static method pf person class");
	}
	
	public Person() {
		System.out.println("person class Constructor");
	}
	
	public void sayHello() {
		System.out.println("yo this is person class");
	}
}
