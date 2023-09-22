package com.jsp.hibernate_one_to_one_uni.controller;

import com.jsp.hibernate_one_to_one_uni.dto.Pan;
import com.jsp.hibernate_one_to_one_uni.service.PanService;

public class InsertPanController {
	public static void main(String[] args) {
		Pan pan = new Pan("WERTY6785C", "James Gosling");
		
		PanService panService = new PanService();
		
		panService.savePanService(pan);
	}

}
