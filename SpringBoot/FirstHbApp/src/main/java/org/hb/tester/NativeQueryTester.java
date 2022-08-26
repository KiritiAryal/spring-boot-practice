package org.hb.tester;

import java.util.List;

import org.hb.entity.Monitor;
import org.hb.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class NativeQueryTester {

	public static void main(String[] args) {
		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Query query = session.createSQLQuery("select * from monitor_tb");
		List<Monitor> list = query.list();
		for (Monitor monitor : list) {
			System.out.println(monitor);
		}
		
		transaction.commit();
		session.close();
		factory.close();
	}

}
