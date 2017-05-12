package com.zino.undue.com.zino.undue.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.zino.undue.com.zino.undue.service.PerCostOfSchoolService;

@RestController
public class PerCostOfSchoolController {
	@Autowired
	private PerCostOfSchoolService perCostOfSchoolService;

	@RequestMapping("/")
	public @ResponseBody String root_test() throws Exception {
		return "Hello Jinho";
	}

	@RequestMapping("/perSchool")
	public String getAllData() {
		return perCostOfSchoolService.selectAllList();
	}
	
	//추가한 코드
	@RequestMapping("/perSchool/perSchoolView") 
	public String getSchoolData( 
			@RequestParam(value = "schoolName", defaultValue = "Unknown", required = false) String schoolName) 
	{
		return perCostOfSchoolService.selectSchoolData(schoolName);
	}
}