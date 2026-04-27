package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity // Table Create
public class Student {

	@Id // mark as Primary key 
	int studId;
	String name;
	String city;

	public Student() {

	}

	public Student(int studId, String name, String city) {
		this.studId = studId;
		this.name = name;
		this.city = city;
	}

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [studId=" + studId + ", name=" + name + ", city=" + city + "]";
	}

}
