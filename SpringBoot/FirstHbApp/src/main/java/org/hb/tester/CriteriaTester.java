package org.hb.tester;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hb.entity.Monitor;
import org.hb.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class CriteriaTester {

	public static void main(String[] args) {
		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery criteriaQuery = builder.createQuery(Monitor.class);
		Root<Monitor> root = criteriaQuery.from(Monitor.class);
		criteriaQuery.select(root);

		Query query = session.createQuery(criteriaQuery);
		List<Monitor> monitors = query.list();
		for (Monitor monitor : monitors) {
			System.out.println(monitor);
		}

		transaction.commit();
		session.close();
		factory.close();
	}

}
