package com.lpu.oto_Car_Engine;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class CarCrudImp implements CarCRUD{
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();

	@Override
	public void saveCar(Car c) {
	    et.begin();
	    em.persist(c);
	    et.commit();
	}

	@Override
	public void updateCarBrand(int id, String name) {
	    Car c = em.find(Car.class, id);

	    if(c != null) {
	    	c.setBrand(name);
	    	
	        et.begin();
	        em.merge(c);
	        et.commit();
	    }
	    else
	        System.out.println("Car not found");
	}

	@Override
	public void deleteCar(int id) {
	    Car c = em.find(Car.class, id);

	    if(c != null) {
	        et.begin();
	        em.remove(c);
	        et.commit();
	    }
	}

	@Override
	public void findCar(int id) {
	    Car c = em.find(Car.class, id);

	    if(c != null) {
	        System.out.println(
	            c.getId()+" "+
	            c.getBrand()+" "+
	            c.getEngine().getCc()
	        );
	    }
	}

	@Override
	public void findAllCar() {
		Query query = em.createQuery("select c from Car c");
		List<Car> list = query.getResultList();
		
		for(Car c : list)
		{
			System.out.print(c.getId() + " ");
			System.out.print(c.getBrand() + " ");
			System.out.print(c.getEngine().getCc() + " ");
			System.out.println();
		}
	}
	
	@Override
	public void findByBrand(String brandName) {
		Query query = em.createQuery("select c from Car c where c.brand = :brand");
		query.setParameter("brand", brandName);
		List<Car> list = query.getResultList();
		
		for(Car c : list)
		{
			System.out.print(c.getId() + " ");
			System.out.print(c.getBrand() + " ");
			System.out.print(c.getEngine().getCc() + " ");
			System.out.println();
		}
	}
}
