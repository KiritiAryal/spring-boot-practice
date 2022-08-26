package com.pack.basic.polymorphism;

public class RuntimePolyTester { // there needs to be some inheritance for Runtime Polymorphism
	
	public static void main(String[] args) 
	{
		Human human = new Human();
		human.walk();
		Man man = new Man();
		man.walk();
		man.age(22);
	}
}
