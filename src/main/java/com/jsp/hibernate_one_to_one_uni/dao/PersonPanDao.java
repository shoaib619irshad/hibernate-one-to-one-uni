package com.jsp.hibernate_one_to_one_uni.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.hibernate_one_to_one_uni.dto.Pan;
import com.jsp.hibernate_one_to_one_uni.dto.Person;

public class PersonPanDao {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("hibernate");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	/*
	 * save Person Pan
	 */
	public Person savePersonPanDao(Pan pan,Person person) {
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(pan);
		entityTransaction.commit();
		
		return person;
	}

}
