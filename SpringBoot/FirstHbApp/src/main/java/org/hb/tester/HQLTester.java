package org.hb.tester;

import java.util.List;

import org.hb.entity.Monitor;
import org.hb.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class HQLTester {

	public static void main(String[] args) {
		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		// for (int i = 1; i <= 10; i++) {
		// Monitor monitor = new Monitor();
		// monitor.setHeight(10 + i);
		// monitor.setWidth(20 + i);
		// session.save(monitor);
		// }

		Query query = session.createQuery("from Monitor");
		List<Monitor> list = query.list();
		for (Monitor monitor : list) {
			System.out.println(monitor);
		}

		System.out.println("-------------------------------------");

		Query query2 = session.createQuery("from Monitor where id = 6");
		List<Monitor> list2 = query2.list();
		for (Monitor monitor : list2) {
			System.out.println(monitor);
		}

		System.out.println("-------------------------------------");

		Query query3 = session.createQuery("from Monitor where height = ?1");
		query3.setParameter(1, 18);
		List<Monitor> list3 = query3.list();
		for (Monitor monitor : list3) {
			System.out.println(monitor);
		}

		System.out.println("-------------------------------------");

		Query query4 = session.createQuery("from Monitor where height = ?1 or width=?2");
		query4.setParameter(1, 14);
		query4.setParameter(2, 25);
		List<Monitor> list4 = query4.list();
		for (Monitor monitor : list4) {
			System.out.println(monitor);
		}

		transaction.commit();
		session.close();
		factory.close();
	}

}
