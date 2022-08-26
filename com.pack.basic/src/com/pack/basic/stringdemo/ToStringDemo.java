package com.pack.basic.stringdemo;

class Tablet{
	private int screenSize;
	
	public Tablet() {
	}
	
	public Tablet(int ss) {
		screenSize = ss;
	}

	@Override				//java compiler always looks for toString() implementation in same class if trying to print object. Implementation: Right click and go to source and do generate toString()
	public String toString() {
		return "Tablet [screenSize=" + screenSize + "]";
	}
}

public class ToStringDemo{
	public static void main(String[] args) {
		Tablet tablet = new Tablet(10);
		System.out.println(tablet);
	}
}
