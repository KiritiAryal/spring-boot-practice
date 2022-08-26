package org.hb.tester;

import org.hb.entity.Passport;
import org.hb.entity.Person;
import org.hb.entity.Plant;
import org.hb.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class OTOTester {

	public static void main(String[] args) {

		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		Passport passport = new Passport();
		passport.setCountry("India");

		Person person = new Person();
		person.setName("Ram");
		person.setPassport(passport);

		session.save(person);
		session.save(passport);

		transaction.commit();
		session.close();
		factory.close();
	}

}
