package com.pack.basic.abstraction;

public class AbstractionTester {
	public static void main(String[] args)
	{
		Bike bike = new Bike();
		bike.brake();
		bike.twoWheeler();
		
		//Vehicle vehicle = new Vehicle(), this cannot be done as it is an abstract class

	}
}
