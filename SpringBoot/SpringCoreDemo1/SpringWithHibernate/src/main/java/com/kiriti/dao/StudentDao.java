package com.kiriti.dao;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.kiriti.entities.Student;

public class StudentDao {
	
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int insert(Student student) {
		Integer sn = (Integer)hibernateTemplate.save(student);
		return sn;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
}
