package com.example.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "users")
public class User {

	@Id
	@Column(name= "id")
	private int id;

	@Column(name="name")
	private String name;

	@Column(name="dob")
	private Date DOB;

	@Column(name="address")
	private String Address;

	@Column(name="email")
	private String email;

	public User( int id, String name, Date dOB, String address,String email) {
		this.id = id;
		this.name = name;
		DOB = dOB;
		Address = address;
		this.email = email;
	}

	public User() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Date getDOB() {
		return DOB;
	}


	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDOB(Date dOB) {
		DOB = dOB;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getAddress() {
		return Address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", DOB=" + DOB + ", Address=" + Address + ", email=" + email + "]";
	}





}
