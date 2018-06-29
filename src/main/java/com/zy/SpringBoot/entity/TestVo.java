package com.zy.SpringBoot.entity;

import java.util.Date;

public class TestVo {
	private String name;
	private Integer Score;
	private Integer male;
	private Date birthday;

	public TestVo(String name, Integer score, Integer male, Date birthday) {
		this.name = name;
		this.Score = score;
		this.male = male;
		this.birthday = birthday;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getScore() {
		return Score;
	}

	public void setScore(Integer score) {
		Score = score;
	}

	public Integer getMale() {
		return male;
	}

	public void setMale(Integer male) {
		this.male = male;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

}
