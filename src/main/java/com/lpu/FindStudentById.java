package com.lpu;

import java.beans.PersistenceDelegate;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class FindStudentById {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
//		Student1 s = em.find(Student1.class, 1);
//		System.out.print(s.getStudentId() + " ");
//		System.out.print(s.getName() + " ");
//		System.out.print(s.getPhone() + " ");
		
		Query query = em.createQuery("select s from Student1 s");
		List<Student1> list = query.getResultList();
		
		Student1 stu = (Student1)query.getSingleResult();
		
		for(Student1 s : list)
		{
			System.out.print(s.getStudentId() + " ");
			System.out.print(s.getName() + " ");
			System.out.print(s.getPhone() + "  ");
			System.out.println();
		}
	}

}
