package org.hb.tester;

import java.util.List;

import org.hb.entity.Monitor;
import org.hb.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class NamedQueryHQLTester {

	public static void main(String[] args) {
		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		Query query = session.createNamedQuery("monitorById");
		query.setParameter(1, 9);
		List<Monitor> list = query.list();
		for (Monitor monitor : list) {
			System.out.println(monitor);
		}

		System.out.println("=========================================");

		Query query2 = session.createNamedQuery("monitorByWidth");
		query2.setParameter(1, 29);
		List<Monitor> list2 = query2.list();
		for (Monitor monitor : list2) {
			System.out.println(monitor);
		}

		transaction.commit();
		session.close();
		factory.close();
	}

}
