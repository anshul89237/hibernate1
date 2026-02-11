package com.lpu.oto_Car_Engine;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class EngineCrudEImp implements EngineCRUD{
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();

	@Override
	public void saveEngine(Engine e) {
	    et.begin();
	    em.persist(e);
	    et.commit();
	}	

	@Override
	public void updateEngineCC(int id, String cc) {
	    Engine e = em.find(Engine.class, id);

	    if(e != null) {
	    	e.setCc(cc);
	    	
	        et.begin();
	        em.merge(e);
	        et.commit();
	    }
	}

	@Override
	public void deleteEngine(int id) {
	    Engine e = em.find(Engine.class, id);

	    if(e != null) {
	        et.begin();
	        em.remove(e);
	        et.commit();
	    }
	}

	@Override
	public void findEngine(int id) {
	    Engine e = em.find(Engine.class, id);

	    if(e != null)
	        System.out.println(e.getId() + " " + e.getCc());
	}

	@Override
	public void findAllEngine() {
		Query query = em.createQuery("select e from Engine e");
		List<Engine> list = query.getResultList();
		
		for(Engine e : list)
		{
			System.out.print(e.getId() + " ");
			System.out.print(e.getCc() + " ");
			System.out.println();
		}
	}
}
