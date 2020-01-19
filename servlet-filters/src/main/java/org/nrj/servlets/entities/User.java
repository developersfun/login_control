package org.nrj.servlets.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column
	public String username;
	@Column
	public String password;
	@Column
	public String name;
	@Column
	public String mailId;
	@Column
	public long phoneNumber;
		
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public User(String username, String password, String name, String mailId, long phoneNumber) {
		this.username = username;
		this.password = password;
		this.name = name;
		this.mailId = mailId;
		this.phoneNumber = phoneNumber;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
