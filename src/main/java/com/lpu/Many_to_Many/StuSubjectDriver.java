package com.lpu.Many_to_Many;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class StuSubjectDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Subject sub1 = new Subject(101, "Java", "Ravi");
		Subject sub2 = new Subject(102, "SQL", "Vaishnav");
		
		List<Subject> subjects = Arrays.asList(sub1, sub2);
		
		Stu s1 = new Stu(10, "Anshul", 8983828193l, subjects);
		Stu s2 = new Stu(11, "Raju", 9832123448l, subjects);
		
		et.begin();
		em.persist(sub1);
		em.persist(sub2);
		em.persist(s1);
		em.persist(s2);
		et.commit();
	}
}
