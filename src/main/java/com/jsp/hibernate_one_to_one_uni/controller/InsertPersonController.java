package com.jsp.hibernate_one_to_one_uni.controller;

import java.time.LocalDate;

import com.jsp.hibernate_one_to_one_uni.dto.Person;
import com.jsp.hibernate_one_to_one_uni.service.PersonService;

public class InsertPersonController {
	public static void main(String[] args) {
		PersonService personService = new PersonService();
		Person person = new Person();
		person.setPersonId(34567);
		person.setPersonName("Bunty");
		person.setPersonEmail("bunty@ymail.com");
		person.setPersonDob(LocalDate.of(1999, 8, 15));
		
		personService.savePersonService(person, "WERTY6785C");
	}

}
