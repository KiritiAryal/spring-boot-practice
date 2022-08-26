package org.hb.utils;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtils {
	private static StandardServiceRegistry registry;
	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {
		try {
			registry = new StandardServiceRegistryBuilder().configure().build();
			MetadataSources metadataSources = new MetadataSources(registry);
			Metadata metadata = metadataSources.getMetadataBuilder().build();
			sessionFactory = metadata.getSessionFactoryBuilder().build();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sessionFactory;
	}

}
