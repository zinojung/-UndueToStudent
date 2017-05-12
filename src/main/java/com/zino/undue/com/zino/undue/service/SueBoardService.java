package com.zino.undue.com.zino.undue.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.zino.undue.com.zino.undue.dao.SueBoardDao;

@Service
public class SueBoardService {
	@Autowired SueBoardDao sueBoardDao;
	
	Gson gson = new Gson();
	public String selectAllList(){
		return gson.toJson(sueBoardDao.selectAllList());
	}
	
	public String selectSueBoardDataWithTitle(String title){
		return gson.toJson(sueBoardDao.selectSueBoardDataWithTitle(title));
	}
	
	public String selectSueBoardDataWithNo(int no){
		return gson.toJson(sueBoardDao.selectSueBoardDataWithNo(no));
	}
}
