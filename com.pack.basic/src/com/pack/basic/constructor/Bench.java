package com.pack.basic.constructor;

public class Bench {
	public Bench()
	{
		this(true);      //when compiling, this line makes it to go to Bench(true), line 10
		System.out.println("default constructor");
	}
	
	public Bench(boolean isTrue)
	{
		this(5.2, "Hey");  //this line makes it to go to line 16
		System.out.println("one arg bench constructor");
	}
	
	public Bench(double price, String args)
	{
		System.out.println("two arg bench constructor");
	}
}
