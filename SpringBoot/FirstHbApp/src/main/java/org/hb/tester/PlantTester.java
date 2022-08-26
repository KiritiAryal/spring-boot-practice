package org.hb.tester;

import org.hb.entity.Plant;
import org.hb.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class PlantTester {

	public static void main(String[] args) {

		// step 1 : create instance of SessionFactory

		SessionFactory factory = HibernateUtils.getSessionFactory();

		// step 2 : open session
		Session session = factory.openSession();

		// step 3 : start the trxn
		Transaction transaction = session.beginTransaction();

		// step 4 : create the instance of Plant class
		Plant plant = new Plant();
		plant.setId(1);
		plant.setName("XYZ");

		// step 5 : save the plant object
		session.save(plant);
		
		//step 6 : commit the DB trxn
		transaction.commit();
	
		
		// step 7: close all the opened connection		
		session.close();
		factory.close();

	}

}
