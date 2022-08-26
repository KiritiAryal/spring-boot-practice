package com.bibekdhungana.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.bibekdhungana.entities.Student;

public class StudentDao {
	
	private HibernateTemplate hibernateTemplate;
	
	//save student method
	public int insert(Student student) {
		Integer i = (Integer)this.hibernateTemplate.save(student);
		return i;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	
}
