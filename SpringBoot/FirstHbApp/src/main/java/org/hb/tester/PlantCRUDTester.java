package org.hb.tester;

import org.hb.entity.Plant;
import org.hb.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class PlantCRUDTester {

	public static void main(String[] args) {
		SessionFactory factory = HibernateUtils.getSessionFactory();

		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();

		// Create
		// for (int i = 2; i <= 10; i++) {
		// Plant plant = new Plant();
		// plant.setId(i);
		// plant.setName("XYZ----" + i);
		// session.save(plant);
		// }

		// Read
		Plant plant = session.get(Plant.class, 4);
		System.out.println("plant name : "+plant.getName());
		
		System.out.println("-------------------------------");		
		
		Plant plantToBeDeleted = new Plant() ;
		plantToBeDeleted.setId(8);
		session.delete(plantToBeDeleted);
		
		System.out.println("-------------------------------");
		
		Plant plantToBeUpdatded = new Plant() ;
		plantToBeUpdatded.setId(3);
		plantToBeUpdatded.setName("ABC----3");
		session.update(plantToBeUpdatded);
		
		transaction.commit();

		session.close();
		factory.close();
	}

}
