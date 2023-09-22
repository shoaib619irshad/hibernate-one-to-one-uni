package com.jsp.hibernate_one_to_one_uni.service;

import com.jsp.hibernate_one_to_one_uni.dao.PanDao;
import com.jsp.hibernate_one_to_one_uni.dto.Pan;

public class PanService {
   PanDao panDao = new PanDao();
	
	/*
	 * save Pan
	 */
	public Pan savePanService(Pan pan) {
		return panDao.savePanDao(pan);
	}

}
