package com.pack.basic;

public class inheritancetest {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.eat();
		
		Lion lion = new Lion();
		lion.eat();
		
		System.out.println("--------");
		System.out.println();
		System.out.println();
		
		Tiger tiger = new Tiger();
		System.out.println("The tiger's name: " + tiger.name);
		tiger.eat();
		
	}

}