package com.example.demo.model;

import java.util.Date;

import lombok.Getter;

@Getter
public class User {
	private int id;
	private String name;
	private Date DOB;
	private String Address;
	
	public User(int id, String name, Date dOB, String address) {
		super();
		this.id = id;
		this.name = name;
		DOB = dOB;
		Address = address;
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

	public String getAddress() {
		return Address;
	}


}
