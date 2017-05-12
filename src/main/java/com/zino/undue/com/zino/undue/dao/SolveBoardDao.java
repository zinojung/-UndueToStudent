package com.zino.undue.com.zino.undue.dao;

import java.util.List;

import com.zino.undue.com.zino.undue.model.SolveBoardModel;

public interface SolveBoardDao {
	public List<SolveBoardModel> selectAllList();
	public SolveBoardModel selectSolveBoardDataWithTitle(String title);
	public SolveBoardModel selectSolveBoardDataWithNo(int no);
}
