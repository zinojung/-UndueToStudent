package com.zino.undue.com.zino.undue.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.zino.undue.com.zino.undue.dao.FreeBoardDao;

@Service
public class FreeBoardService {
	@Autowired FreeBoardDao freeBoardDao;
	
	Gson gson = new Gson();
	public String selectAllList(){
		return gson.toJson(freeBoardDao.selectAllList());
	}
	
	public String selectFreeBoardDataWithTitle(String title){
		return gson.toJson(freeBoardDao.selectFreeBoardDataWithTitle(title));
	}
	
	public String selectFreeBoardDateWithNo(int no){
		return gson.toJson(freeBoardDao.selectFreeBoardDataWithNo(no));
	}
}
