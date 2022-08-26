package org.spcore.hb.tester;

import org.spcore.hb.dao.JdbcDao;
import org.spcore.hb.entity.Plant;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PlantTester {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springWithHibernate.xml");
		// JdbcDao jdbcDao = (JdbcDao) applicationContext.getBean("jdbcDaoImpl");
		JdbcDao jdbcDao = applicationContext.getBean("jdbcDaoImpl", JdbcDao.class);

		Plant plant = new Plant();
		plant.setName("Abc");

		int status = jdbcDao.save(plant);
		if (status > 0)
			System.out.println("object saved in DB");
		else
			System.out.println("something went wrong");

	}

}
