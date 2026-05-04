package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Student {

	@Id
	int studId;
	String name;
	String city;

	@OneToOne()
	Laptop laptopId;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int studId, String name, String city, Laptop laptopId) {
		super();
		this.studId = studId;
		this.name = name;
		this.city = city;
		this.laptopId = laptopId;
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

	public Laptop getLaptopId() {
		return laptopId;
	}

	public void setLaptopId(Laptop laptopId) {
		this.laptopId = laptopId;
	}

	@Override
	public String toString() {
		return "Student [studId=" + studId + ", name=" + name + ", city=" + city + ", laptopId=" + laptopId + "]";
	}

}
