package com.pack.basic.exception;

public class TryCatchException1 {
	
	public static void main(String[] args) {
		System.out.println("statement 1");
		System.out.println("statement 2");
		System.out.println("statement 3");
		try {
			System.out.println(4/0);
		}catch(ArithmeticException ae) {
			System.out.println(ae.getMessage());
		}
		System.out.println("statement 4");
		System.out.println("statement 5");
		System.out.println("statement 6");
		System.out.println("statement 7");
		
	}

}
