package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // Table Create
@Table(name = "studRecord")
public class Student {

	@Id // mark as Primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int studId;

	@Column(nullable = false)
	String name;
	@Column(name = "address")
	String city;
	@Column(unique = true)
	String email;

	public Student() {

	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Student(int studId, String name, String city, String email) {
		super();
		this.studId = studId;
		this.name = name;
		this.city = city;
		this.email = email;
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
		return "Student [studId=" + studId + ", name=" + name + ", city=" + city + ", email=" + email + "]";
	}
}
