package com.lpu.many_to_one;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class EmpCompanyDriver {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
//		Company com = new Company(101, "Capgemini", "Bengaluru");
//		
//		Emp e1 = new Emp(10, "Ansh", 30000.00, com);
//		Emp e2 = new Emp(11, "Raju", 25000.00, com);
//		
//		
//		et.begin();
//		em.persist(e1);
//		em.persist(e2);
//		em.persist(com);
//		et.commit();
		
		Emp e = em.find(Emp.class, 104);
		System.out.print(e.getId() +  " ");
		System.out.print(e.getName() + " ");
		System.out.print(e.getSal() + " ");
		System.out.print(e.getCompany().getName() + " ");
		System.out.println();
	}
}
