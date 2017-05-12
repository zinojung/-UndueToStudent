package com.zino.undue.com.zino.undue.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.zino.undue.com.zino.undue.dao.SolveBoardDao;

@Service
public class SolveBoardService {
	@Autowired	SolveBoardDao solveBoardDao;
	
	Gson gson = new Gson();
	public String selectAllList(){
		return gson.toJson(solveBoardDao.selectAllList());
	}
	
	public String selectSolveBoardDataWithTitle(String title){
		return gson.toJson(solveBoardDao.selectSolveBoardDataWithTitle(title));
	}
	
	public String selectSolveBoardDataWithNo(int no){
		return gson.toJson(solveBoardDao.selectSolveBoardDataWithNo(no));
	}
	
}
