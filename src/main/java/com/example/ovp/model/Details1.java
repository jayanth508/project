package com.example.ovp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="First Table")
public class Details1 {
@Id
private String username;
private String mailid;
private String password;
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getMailid() {
	return mailid;
}
public void setMailid(String mailid) {
	this.mailid = mailid;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public Details1(String username, String mailid, String password) {
	super();
	this.username = username;
	this.mailid = mailid;
	this.password = password;
}
public Details1() {
	super();
	// TODO Auto-generated constructor stub
}


}
