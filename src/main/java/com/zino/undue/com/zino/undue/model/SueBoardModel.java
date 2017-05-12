package com.zino.undue.com.zino.undue.model;

import lombok.Data;

@Data
public class SueBoardModel {
	private int sueBoardNo;
	private int mno;
	private String title;
	private String content;
	private int numOfLike;
	private int numOfView;
	private String creDate;
}
