package com.zino.undue.com.zino.undue.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.zino.undue.com.zino.undue.dao.PerCostOfSchoolDao;

@Service
public class PerCostOfSchoolService {
	@Autowired PerCostOfSchoolDao perCostOfSchoolDao;
	
	Gson gson = new Gson();
	public String selectAllList() { 
		return gson.toJson(perCostOfSchoolDao.selectAllList()); 
	}
	
	public String selectSchoolData(String schoolName) {
		return gson.toJson(perCostOfSchoolDao.selectSchoolData(schoolName));
	}
}
