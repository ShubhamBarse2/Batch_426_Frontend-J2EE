package com.jbk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("clg")
public class College {

	@Value("1")
	int clgId;
	@Value("JSPM")
	String clgName;

	@Autowired
	Student std;

	public College() {
		super();
		// TODO Auto-generated constructor stub
	}

	public College(int clgId, String clgName, Student std) {
		super();
		this.clgId = clgId;
		this.clgName = clgName;
		this.std = std;
	}

	public int getClgId() {
		return clgId;
	}

	public void setClgId(int clgId) {
		this.clgId = clgId;
	}

	public String getClgName() {
		return clgName;
	}

	public void setClgName(String clgName) {
		this.clgName = clgName;
	}

	public Student getStd() {
		return std;
	}

	public void setStd(Student std) {
		this.std = std;
	}

	@Override
	public String toString() {
		return "College [clgId=" + clgId + ", clgName=" + clgName + ", std=" + std + "]";
	}

}
