package com.bibekdhungana;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bibekdhungana.dao.StudentDao;
import com.bibekdhungana.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context =  new ClassPathXmlApplicationContext("springWithHibernate.xml");
        StudentDao studentDao =  context.getBean("", StudentDao.class);
        
        Student s = new Student();
        s.setStudentId(1);
        s.setStudentName("Bibek Dhungana");
        s.setStudentCity("Lubbock");
        
        studentDao.insert(s);
    }
}