package org.hb.tester;

import java.util.ArrayList;
import java.util.List;

import org.hb.entity.Passport;
import org.hb.entity.Person;
import org.hb.entity.Plant;
import org.hb.entity.User;
import org.hb.entity.Vehicle;
import org.hb.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class OTMTester {

	public static void main(String[] args) {

		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		Vehicle vehicle1 = new Vehicle();
		vehicle1.setType("2 wheeler");

		Vehicle vehicle2 = new Vehicle();
		vehicle2.setType("4 wheeler");

		Vehicle vehicle3 = new Vehicle();
		vehicle3.setType("18 wheeler");

		List<Vehicle> vehicles = new ArrayList<Vehicle>();
		vehicles.add(vehicle1);
		vehicles.add(vehicle2);
		vehicles.add(vehicle3);

		User user = new User();
		user.setName("Shyam");
		user.setVehicles(vehicles);

		session.save(user);
//		session.save(vehicle1);
//		session.save(vehicle2);
//		session.save(vehicle3);

		transaction.commit();
		session.close();
		factory.close();
	}

}
