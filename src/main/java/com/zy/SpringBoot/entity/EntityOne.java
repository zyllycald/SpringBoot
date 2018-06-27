package com.zy.SpringBoot.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EntityOne {
	
	@Value("${com.zy.entity.name}")
	private String name;
	
	@Value("${com.zy.entity.type}")
	private String type;
	
	@Value("${com.zy.entity.people}")
	private String people;
	
	@Value("${com.zy.entity.stringTest}")
	private String stringTest;
	
	@Value("${com.zy.entity.intTest}")
	private int intTest;
	
	@Value("${com.zy.entity.longTest}")
	private long longTest;
	
	@Value("${com.zy.entity.intTestTwo}")
	private int intTestTwo;
	
	@Value("${com.zy.entity.intTestThree}")
	private int intTestThree;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPeople() {
		return people;
	}

	public void setPeople(String people) {
		this.people = people;
	}

	public String getStringTest() {
		return stringTest;
	}

	public void setStringTest(String stringTest) {
		this.stringTest = stringTest;
	}

	public int getIntTest() {
		return intTest;
	}

	public void setIntTest(int intTest) {
		this.intTest = intTest;
	}

	public long getLongTest() {
		return longTest;
	}

	public void setLongTest(long longTest) {
		this.longTest = longTest;
	}

	public int getIntTestTwo() {
		return intTestTwo;
	}

	public void setIntTestTwo(int intTestTwo) {
		this.intTestTwo = intTestTwo;
	}

	public int getIntTestThree() {
		return intTestThree;
	}

	public void setIntTestThree(int intTestThree) {
		this.intTestThree = intTestThree;
	}

	
	
}
