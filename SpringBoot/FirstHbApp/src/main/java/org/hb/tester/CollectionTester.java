package org.hb.tester;

import java.util.ArrayList;
import java.util.List;

import org.hb.entity.Employee;
import org.hb.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CollectionTester {

	public static void main(String[] args) {

		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("Ram");

		List<String> hobbies = new ArrayList<String>();
		hobbies.add("gaming");
		hobbies.add("movies");
		hobbies.add("coding");
		employee.setHobbies(hobbies);

		session.save(employee);
		transaction.commit();
		session.close();
		factory.close();

	}

}
