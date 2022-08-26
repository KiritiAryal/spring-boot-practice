package com.kiriti;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;



public class Person {
	
	private String name;
	private int age;
	
	
	public Person() {
		super();
		
	}


	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Bean initialization");
	}


	public String getName() {
		return name;
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Bean Destruction");
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	


	
	
	
	

}