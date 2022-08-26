package com.kiriti;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kiriti.dao.StudentDao;
import com.kiriti.entities.Student;

public class App {
	public static void main(String[] args) {
		ApplicationContext context =  new ClassPathXmlApplicationContext("config.xml");
		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
		
		Student student = new Student(2, "Manny", "Lubbock");
		
		System.out.println(studentDao.insert(student));
		
	}
}
