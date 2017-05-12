package com.zino.undue.com.zino.undue.dao;

import java.util.List;

import com.zino.undue.com.zino.undue.model.PerCostOfSchoolModel;

public interface PerCostOfSchoolDao {
	public List<PerCostOfSchoolModel> selectAllList();
	public PerCostOfSchoolModel selectSchoolData(String schoolName);
}
 