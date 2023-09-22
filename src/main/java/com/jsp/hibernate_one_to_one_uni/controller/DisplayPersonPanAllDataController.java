package com.jsp.hibernate_one_to_one_uni.controller;

import java.util.List;

import com.jsp.hibernate_one_to_one_uni.dto.Pan;
import com.jsp.hibernate_one_to_one_uni.dto.Person;
import com.jsp.hibernate_one_to_one_uni.service.PersonService;

public class DisplayPersonPanAllDataController {
	public static void main(String[] args) {

		PersonService personService = new PersonService();

		List<Person> persons = personService.getAllPersonPanService();

		for (Person person : persons) {

			System.out.println("person======Details");

			System.out.println("personId = " + person.getPersonId());
			System.out.println("personName = " + person.getPersonName());
			System.out.println("personEmail = " + person.getPersonEmail());
			System.out.println("personDob = " + person.getPersonDob());

			Pan pan = person.getPan();
			
			if (pan != null) {
				System.out.println("------pan-----Details-----");
				System.out.println("panNumber = " + pan.getPanNumber());
				System.out.println("fatherName = " + pan.getFathersName());
			} else {
				System.out.println("person does not have pan ...please check once");
			}
			

		}
	}

}
