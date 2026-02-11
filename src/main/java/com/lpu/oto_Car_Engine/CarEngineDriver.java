package com.lpu.oto_Car_Engine;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class CarEngineDriver {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Engine e = new Engine();
		e.setId(101);
		e.setCc("2500CC");
		
		Car c = new Car();
		c.setId(11);
		c.setBrand("AUDI");
		c.setEngine(e);
		
		et.begin();
		em.persist(c);
		em.persist(e);
		et.commit();
	}
}
