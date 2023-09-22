package com.jsp.hibernate_one_to_one_uni.controller;

import java.time.LocalDate;

import com.jsp.hibernate_one_to_one_uni.dto.Pan;
import com.jsp.hibernate_one_to_one_uni.dto.Person;
import com.jsp.hibernate_one_to_one_uni.service.PersonPanService;

public class InsertPersonPanController {
     public static void main(String[] args) {
		
		PersonPanService panService = new PersonPanService();
		
		LocalDate date=LocalDate.of(2017, 01, 01);
		
		
		Pan pan = new Pan("FHJ67", "Mukul");
		Person person = new Person(435, "Gokul", "gokul@gmail.com", date, pan);
		
		/*
		 * first parameter is pan and second parameter is person 
		 */
		panService.savePersonPanService(pan, person);
	}

}
