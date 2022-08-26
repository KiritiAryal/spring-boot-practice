package org.hb.tester;

import java.util.ArrayList;
import java.util.List;

import org.hb.entity.Passport;
import org.hb.entity.Person;
import org.hb.entity.Plant;
import org.hb.entity.Student;
import org.hb.entity.Teacher;
import org.hb.entity.User;
import org.hb.entity.Vehicle;
import org.hb.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class MTMTester {

	public static void main(String[] args) {

		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		Student student1 = new Student();
		student1.setName("Sandesh");

		Student student2 = new Student();
		student2.setName("Kiriti");

		Teacher teacher1 = new Teacher();
		teacher1.setName("Pankaj");

		Teacher teacher2 = new Teacher();
		teacher2.setName("Pawan");

		List<Student> students = new ArrayList<Student>();
		students.add(student1);
		students.add(student2);

		List<Teacher> teachers = new ArrayList<Teacher>();
		teachers.add(teacher1);
		teachers.add(teacher2);

		student1.setTeachers(teachers);
		student2.setTeachers(teachers);

		teacher1.setStudents(students);
		teacher2.setStudents(students);

		session.save(teacher1);
		session.save(teacher2);

		transaction.commit();
		session.close();
		factory.close();
	}

}
