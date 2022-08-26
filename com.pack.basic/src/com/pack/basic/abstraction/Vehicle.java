package com.pack.basic.abstraction;

public abstract class Vehicle { // can have mix of abstract and non-abstract methods
	
	public void twoWheeler() {   //non-abstract method
		System.out.println("inside two wheeeler method");
	}
	
	public abstract void brake(); //abstract method

}
