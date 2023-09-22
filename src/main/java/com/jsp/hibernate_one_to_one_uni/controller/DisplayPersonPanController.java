package com.jsp.hibernate_one_to_one_uni.controller;

import com.jsp.hibernate_one_to_one_uni.dto.Pan;
import com.jsp.hibernate_one_to_one_uni.dto.Person;
import com.jsp.hibernate_one_to_one_uni.service.PersonService;

public class DisplayPersonPanController {
	public static void main(String[] args) {
		PersonService personService = new PersonService();
		
		Person person=personService.getPersonPanByPersonIdService(435);
		
		if(person!=null) {
			
			Pan pan = person.getPan();
			System.out.println("------pan-----Details-----");
			System.out.println("panNumber = "+pan.getPanNumber());
			System.out.println("fathersName = "+pan.getFathersName());
			
			System.out.println("person======Details");
			
			System.out.println("personId = "+person.getPersonId());
			System.out.println("personName = "+person.getPersonName());
			System.out.println("personEmail = "+person.getPersonEmail());
			System.out.println("personDob = "+person.getPersonDob());
		}else {
			System.out.println("person given id is not present........");
		}
	}

}
