package com.pack.basic.polymorphism;

public class Laptop {
	
	public void hdd() {
		System.out.println("1 TB HDD"); 
	}
	
	public void hdd(int hddSize) {
		System.out.println(hddSize + " TB HDD");
	}
	
	public void hdd(String hddName) {
		System.out.println(hddName + " ");
	}
	
	public void hdd(String hddName, int hddSize) {
		System.out.println(hddName + " " + hddSize);
	}
}
