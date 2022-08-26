package com.basic.superdemo;

public class Tree extends Forest {
	public Tree() {
		//super();       // calls default constructor of parent class
		super(5);
		System.out.println("This is a big tree!!");
	}
	public void treeName() {
		super.location();
		System.out.println(super.size);
		System.out.println("Inside treeName method!!");
	}

}
