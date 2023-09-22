package com.jsp.hibernate_one_to_one_uni.service;

import java.util.List;

import com.jsp.hibernate_one_to_one_uni.dao.PanDao;
import com.jsp.hibernate_one_to_one_uni.dao.PersonDao;
import com.jsp.hibernate_one_to_one_uni.dto.Pan;
import com.jsp.hibernate_one_to_one_uni.dto.Person;

public class PersonService {
	PersonDao personDao = new PersonDao();
	PanDao panDao = new PanDao();
	
	/*
	 * save Person
	 */
	public Person savePersonService(Person person,String panNumber) {
		
		Pan pan = panDao.getPanById(panNumber);
		
		if(pan!=null) {
			/*
			 * because of below line our pan foreign key will get generated
			 */
			person.setPan(pan);
			/*
			 * 
			 */
			personDao.savePersonDao(person);
		}
		
		return person;
	}
	
	/*
	 * getPersonPanByPersonId
	 */
	public Person getPersonPanByPersonIdService(int personId) {
		return personDao.getPersonPanByPersonIdDao(personId);
	}
	
	/*
	 * Get All Person Pan Data
	 */
	public List<Person> getAllPersonPanService(){
		
		return personDao.getAllPersonPanDao();
	}

}
