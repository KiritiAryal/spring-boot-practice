package org.spcore.hb.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.spcore.hb.entity.Plant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcDaoImpl implements JdbcDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public int save(Plant plant) {
		Session session = sessionFactory.getCurrentSession();
		int status = (Integer) session.save(plant);
		return status;
	}

}
