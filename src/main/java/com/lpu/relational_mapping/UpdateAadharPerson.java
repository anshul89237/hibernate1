package com.lpu.relational_mapping;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class UpdateAadharPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emp = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emp.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Person p = em.find(Person.class, 10);
		p.setName("Anshul");
		
		Aadhar a = p.getAadhar();
		a.setLocation("India");
		
		et.begin();
		
		em.merge(p);
		em.merge(a);
		
		et.commit();
	}

}
