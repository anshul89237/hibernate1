package com.lpu.relational_mapping;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class DeleteAadharPerson {

	public static void main(String[] args) {
		
		EntityManagerFactory emp = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emp.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Person p = em.find(Person.class, 11);
		
		Aadhar a = p.getAadhar();
		
		et.begin();
		em.remove(p);
		et.commit();
	}
}
