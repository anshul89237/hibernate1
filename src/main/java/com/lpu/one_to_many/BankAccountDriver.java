package com.lpu.one_to_many;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class BankAccountDriver {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Account a1 = new Account(10, "Raju", 150.00);
		Account a2 = new Account(11, "Ansh", 500.00);
		
		Bank b = new Bank(101, "SBI", "Mohali");
		List<Account> list = new ArrayList<>();
		
		list.add(a1);
		list.add(a2);
		b.setAccountNo(list);
		
		et.begin();
		em.persist(a1);
		em.persist(a2);
		em.persist(b);
		et.commit();
	}
}
