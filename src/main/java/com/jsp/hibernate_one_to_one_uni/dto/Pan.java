package com.jsp.hibernate_one_to_one_uni.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pan {
	@Id
	private String panNumber;
	private String fathersName;
	
	public void displayPan() {
		System.out.println("PanNumber: "+panNumber);
		System.out.println("Father's Name: "+fathersName);
		
	}
}
