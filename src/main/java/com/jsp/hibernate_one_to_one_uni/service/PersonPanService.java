package com.jsp.hibernate_one_to_one_uni.service;

import com.jsp.hibernate_one_to_one_uni.dao.PersonPanDao;
import com.jsp.hibernate_one_to_one_uni.dto.Pan;
import com.jsp.hibernate_one_to_one_uni.dto.Person;

public class PersonPanService {
	PersonPanDao panDao = new PersonPanDao();
	/*
	 * save Person Pan
	 */
	public Person savePersonPanService(Pan pan,Person person) {
		
		return panDao.savePersonPanDao(pan, person);
	}

}
