package com.jbk;

public class College {

	int collegeId;
	String cName;
	Student std;

	@Override
	public String toString() {
		return "College [collegeId=" + collegeId + ", cName=" + cName + ", std=" + std + "]";
	}

	public College() {
		super();
		// TODO Auto-generated constructor stub
	}

	public College(int collegeId, String cName, Student std) {
		super();
		this.collegeId = collegeId;
		this.cName = cName;
		this.std = std;
	}

	public int getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public Student getStd() {
		return std;
	}

	public void setStd(Student std) {
		this.std = std;
	}

}
