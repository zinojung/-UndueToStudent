package com.zino.undue.com.zino.undue.model;

import lombok.Data;

@Data
public class SolveBoardModel {
	private int solveBoardNo;
	private int mno;
	private String title;
	private String content;
	private int numOfLike;
	private int numOfView;
	private String creDate;
}
