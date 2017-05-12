package com.zino.undue.com.zino.undue.dao;

import java.util.List;

import com.zino.undue.com.zino.undue.model.FreeBoardModel;

public interface FreeBoardDao {
	public List<FreeBoardModel> selectAllList();
	public FreeBoardModel selectFreeBoardDataWithTitle (String title);
	public FreeBoardModel selectFreeBoardDataWithNo(int no);
}
