package com.pack.basic.block;

public class Remote {
	
	{
		System.out.println("instance block");	//always prints out at the top even when you put it in different spot, instance blocks are not common in java
		
	}
	public Remote() {
		System.out.println("default constructor");
	}
	
	public void print() {
		System.out.println("inside print method");
	}

}
