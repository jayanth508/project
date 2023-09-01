package com.example.ovp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Third Table")
public class Details3 {
	@Id
	private int id;
private String time;
private String startat;
private String endat;
public Details3() {
	super();
	// TODO Auto-generated constructor stub
}
public Details3(int id, String time, String startat, String endat) {
	super();
	this.id = id;
	this.time = time;
	this.startat = startat;
	this.endat = endat;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTime() {
	return time;
}
public void setTime(String time) {
	this.time = time;
}
public String getStartat() {
	return startat;
}
public void setStartat(String startat) {
	this.startat = startat;
}
public String getEndat() {
	return endat;
}
public void setEndat(String endat) {
	this.endat = endat;
}


}
