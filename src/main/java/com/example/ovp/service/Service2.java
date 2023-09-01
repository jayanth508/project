package com.example.ovp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import org.springframework.stereotype.Service;
import com.example.ovp.model.Details2;
import com.example.ovp.model.repository.Repository2;

@Service
public class Service2 {
@Autowired
Repository2 sr;
public List<Details2> saveinfo(List<Details2> ss)
{
	return sr.saveAll(ss);
}
public List<Details2> showinfo()
{
	return sr.findAll();
}
public Optional<Details2> getbyid(Long phone_no)
{
	return sr.findById(phone_no);
}
public Details2 updateinfo(Details2 ss)
{
	return sr.saveAndFlush(ss);
}
public String updatebyid(Long phone_no,Details2 ss)
{
	sr.saveAndFlush(ss);
	 if(sr.existsById(phone_no))
	 {
		 return "valid number";
	 }
	 else
	 {
		 return "please enter the valid number";
	 }
}
public String deleteat(Long phone_no)
{
	if(sr.existsById(phone_no))
	{
		sr.deleteById(phone_no);
		return "valid number";
		
	}
	else
	{
		return "Invalid number";
	}
}
public List<Details2> sortasc(String name)
{
	return sr.findAll(Sort.by(Sort.Direction.ASC,name));
}
public List<Details2> sortdesc(String name)
{
	return sr.findAll(Sort.by(Sort.Direction.DESC,name));
}
public List<Details2> pagging(int pgno,int pgsize)
{
	Page<Details2> p=sr.findAll(PageRequest.of(pgno, pgsize));
	return p.getContent();
	}
//select for or statement
public List<Details2> gt(int age,String name)
{
	return sr.geti(age, name);
}
//select for and statement
public List<Details2> gand(int age,String name)
{
	return sr.getand(age, name);
}
//select for like start
public List<Details2> gstart(String name)
{
	return sr.getstart(name);
}
//select for like end
public List<Details2> gend(String name)
{
	return sr.getend(name);
}
//update
public Integer updat(String name,String name1)
{
	return sr.up(name,name1);
}
//delete
public Integer del(int id)
{
	return sr.de(id);
}
}
