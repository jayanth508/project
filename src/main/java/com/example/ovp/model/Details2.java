package com.example.ovp.model;
import java.util.List;

import jakarta.persistence.CascadeType;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Second Table")
public class Details2 {
private String name;
@Id
private Long phone_no;
private int age;
private String service;
private String destination;
private String date;
@OneToMany(cascade = CascadeType.ALL)
@JoinColumn(name="link_id")
private List<Details3> many;
	
@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name="join_id")
private Details1 one;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Long getPhone_no() {
	return phone_no;
}

public void setPhone_no(Long phone_no) {
	this.phone_no = phone_no;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getservice() {
	return service;
}

public void service(String service) {
	this.service = service;
}

public String getDestination() {
	return destination;
}

public void setDestination(String destination) {
	this.destination = destination;
}

public String getDate() {
	return date;
}

public void setDate(String date) {
	this.date = date;
}

public List<Details3> getMany() {
	return many;
}

public void setMany(List<Details3> many) {
	this.many = many;
}

public Details1 getOne() {
	return one;
}

public void setOne(Details1 one) {
	this.one = one;
}

public Details2(String name, Long phone_no, int age, String service, String destination, String date,
		List<Details3> many, Details1 one) {
	super();
	this.name = name;
	this.phone_no = phone_no;
	this.age = age;
	this.service = service;
	this.destination = destination;
	this.date = date;
	this.many = many;
	this.one = one;
}

public Details2() {
	super();
	// TODO Auto-generated constructor stub
}


}
