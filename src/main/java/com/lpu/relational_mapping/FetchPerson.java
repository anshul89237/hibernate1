package com.lpu.relational_mapping;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class FetchPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emp = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emp.createEntityManager();
		
		Person person = em.find(Person.class, 10);
		System.out.print(person.getId() + " ");
		System.out.print(person.getName() + " ");
		System.out.println();
		
		Aadhar aadhar = person.getAadhar();
		System.out.print(aadhar.getId() + " ");
		System.out.print(aadhar.getLocation() + " ");
	}

}
