package com.lpu.one_to_many;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class FindBankAccount {
	
	public static void main(String args[])
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
//		Bank bank = em.find(Bank.class, 101);
//		System.out.println("------BANK------");
//		System.out.print(bank.getId() + " ");
//		System.out.print(bank.getName() + " ");
//		System.out.print(bank.getLocation() + " ");
//		
//		List<Account> list = bank.getAccountNo();
//		System.out.println("\n------ACCOUNT------");
//		for(Account a : list)
//		{
//			System.out.print(a.getId() + " ");
//			System.out.print(a.getName() + " ");
//			System.out.print(a.getBalance() + " ");
//			System.out.println();
//		}
		
		// DELETE ACCOUNT
		Account acc = em.find(Account.class, 11);
		
		et.begin();
		em.remove(acc);
		et.commit();
		
	}
}	
