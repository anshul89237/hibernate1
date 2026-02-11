package com.lpu.relational_mapping;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Driver {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Aadhar a = new Aadhar();
		a.setId(100);
		a.setLocation("China");
		
		Aadhar a1 = new Aadhar();
		a1.setId(101);
		a1.setLocation("India");
		
		Person p = new Person();
		p.setId(10);
		p.setName("Ansh");
		p.setAadhar(a);
		
		Person p1 = new Person();
		p1.setId(11);
		p1.setName("Ram");
		p1.setAadhar(a1);
		
		et.begin();
		em.persist(p1);
		em.persist(a1);
		et.commit();
	}

}
