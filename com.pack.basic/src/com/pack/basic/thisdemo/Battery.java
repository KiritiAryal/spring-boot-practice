package com.pack.basic.thisdemo;

public class Battery {
	
	public Battery() {
		this(5);
		System.out.println("default constructor of battery");
	}
	public Battery(int num)
	{
		this("Hey");
		System.out.println("2nd constructor");
	}
	public Battery(String hey)
	{
		System.out.println("Last constructor");
	}
	public void power() {
		this.price();
		System.out.println("power of battery");
	}
	public void price() {
		System.out.println("price of battery");
	}

}
