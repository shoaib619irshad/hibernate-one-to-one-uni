package com.jsp.hibernate_one_to_one_uni.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.hibernate_one_to_one_uni.dto.Pan;

public class PanDao {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("hibernate");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	/*
	 * save Pan
	 */
	public Pan savePanDao(Pan pan) {
		entityTransaction.begin();
		entityManager.persist(pan);
		entityTransaction.commit();
		return pan;
	}
	
	/*
	 * Get Pan by Id
	 */
	public Pan getPanById(String panNumber) {
		return entityManager.find(Pan.class, panNumber);
	}

}
