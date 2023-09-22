package com.jsp.hibernate_one_to_one_uni.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.hibernate_one_to_one_uni.dto.Person;

public class PersonDao {

	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("hibernate");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	/*
	 * save Person
	 */
	public Person savePersonDao(Person person) {
		entityTransaction.begin();
		entityManager.persist(person);
		entityTransaction.commit();
		return person;
	}
	
	/*
	 * getPersonPanByPersonId
	 */
	public Person getPersonPanByPersonIdDao(int personId) {	
		Person person=entityManager.find(Person.class, personId);
		return person;
	}
	
	/*
	 * Get All Person Pan Data
	 */
	public List<Person> getAllPersonPanDao(){
		
		return entityManager.createQuery("FROM Person").getResultList();
	}

}
