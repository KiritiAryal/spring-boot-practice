package com.pack.basic.stringdemo;

public class StringDemo {
	public static void main(String[] args)
	{
		String str = new String("HeY!");
		String str1 = "HEY!";
		
		if(str.equalsIgnoreCase(str1))		//this string method ignores capital or small(uppercase or lowercase) and just considers if the contents are equal
		{
			System.out.println("They are equal.");
		}
		else
		{
			System.out.println("They are not equal.");
		}
	}
}
