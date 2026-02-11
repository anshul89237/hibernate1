package com.lpu;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class SaveStudent {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager(); // CRUD METHODS
		EntityTransaction et = em.getTransaction(); // FOR DML OPERATIONS INSERT, UPDATE, DELETE
		
		Student1 s = new Student1();
		s.setStudentId(1);
		s.setName("Ansh");
		s.setPhone(8928998293l);
		
		Student1 s2 = new Student1();
		s2.setStudentId(2);
		s2.setName("Ram");
		s2.setPhone(9992999199l);
		
		Student1 s3 = new Student1();
		s3.setStudentId(3);
		s3.setName("Shyam");
		s3.setPhone(9812929193l);
		
		et.begin();
		em.persist(s);
		em.persist(s2);
		em.persist(s3);
//		Student1 s = em.find(Student1.class, 0);
//		em.remove(s);
//		Student1 s2 = em.find(Student1.class, 2);
//		em.remove(s2);
//		Student1 s3 = em.find(Student1.class, 3);
//		em.remove(s3);
		et.commit();
	}
}
