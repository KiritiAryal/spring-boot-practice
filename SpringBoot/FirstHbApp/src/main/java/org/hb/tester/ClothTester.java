package org.hb.tester;

import org.hb.entity.Cloth;
import org.hb.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class ClothTester {

	public static void main(String[] args) {
		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		for (int i = 0; i <= 10; i++) {
			Cloth cloth = new Cloth();
			cloth.setType("silk ----" + i);
			session.save(cloth);
		}

		transaction.commit();
		session.close();
		factory.close();
	}

}
