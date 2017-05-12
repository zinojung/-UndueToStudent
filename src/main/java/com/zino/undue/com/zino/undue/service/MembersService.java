package com.zino.undue.com.zino.undue.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.zino.undue.com.zino.undue.dao.MembersDao;

@Service
public class MembersService {
	@Autowired MembersDao membersDao;
	
	Gson gson = new Gson();
	public String selectMemberDataWithEmail(String email){
		return gson.toJson(membersDao.selectMemberDataWithEmail(email));
	}
	
	public String selectMemberDataWithNick(String nickname){
		return gson.toJson(membersDao.selectMemberDataWithNick(nickname));
	}
}
