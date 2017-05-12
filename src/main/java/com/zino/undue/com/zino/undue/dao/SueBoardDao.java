package com.zino.undue.com.zino.undue.dao;

import java.util.List;

import com.zino.undue.com.zino.undue.model.SueBoardModel;

public interface SueBoardDao {
	public List<SueBoardModel> selectAllList();
	public SueBoardModel selectSueBoardDataWithTitle(String title);
	public SueBoardModel selectSueBoardDataWithNo(int no);
}
