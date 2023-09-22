package com.jsp.hibernate_one_to_one_uni.dto;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
	@Id
	private int personId;
	private String personName;
	private String personEmail;
	private LocalDate personDob;
	
	@OneToOne
	@JoinColumn(name = "panNumber")
	private Pan pan;

}
