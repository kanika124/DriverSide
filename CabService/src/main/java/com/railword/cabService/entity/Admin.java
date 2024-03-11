package com.railword.cabService.entity;

import jakarta.persistence.OneToMany;

public class Admin {

	private int id;
	private String userName;
	private int password;
	@OneToMany
	private Driver driver;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(int id, String userName, int password, Driver driver) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.driver = driver;
	}

	@Override
	public String toString() {
		return "Admin [id=" + id + ", userName=" + userName + ", password=" + password + ", driver=" + driver + "]";
	}

}
