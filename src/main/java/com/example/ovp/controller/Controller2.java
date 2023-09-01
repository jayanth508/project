package com.example.ovp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.ovp.model.Details2;
import com.example.ovp.service.Service2;

@RestController
public class Controller2 {
@Autowired
Service2 sser;
@PostMapping("post")
public List<Details2> disp(@RequestBody List<Details2> ss)
{
	return sser.saveinfo(ss);
}

@GetMapping("get")
public List<Details2> dis()
{
	return sser.showinfo();
}
@GetMapping("get/{phone_no}")
public Optional<Details2> getid(@PathVariable Long phone_no)
{
	return sser.getbyid(phone_no);
}
@PutMapping("put")
public Details2 update(@RequestBody Details2 ss)
{
	return sser.updateinfo(ss);
}
@PutMapping("put/{phone_no}")
public String updateby(@PathVariable Long phone_no,@RequestBody Details2 ss)
{
	return sser.updatebyid(phone_no,ss);
}
@DeleteMapping("delete/{phone_no}")
public String delete(@PathVariable Long phone_no)
{
	return sser.deleteat(phone_no);
}
@GetMapping("getasc/{name}")
public List<Details2> sorta(@PathVariable String name)
{
	return sser.sortasc(name);
}
@GetMapping("getdesc/{name}")
public List<Details2> sortd(@PathVariable String name)
{
	return sser.sortdesc(name);
}
//select or
	@GetMapping("/getn/{age}/{name}")
	public List<Details2> gtn(@PathVariable int age,@PathVariable String name)
	{
		return sser.gt(age, name);
	}
	//select and
	@GetMapping("/getand/{age}/{name}")
	public List<Details2> gan(@PathVariable int age,@PathVariable String name)
	{
		return sser.gand(age, name);
	}
//	//select like start
	@GetMapping("getlike/{name}")
	public List<Details2> gli(@PathVariable String name)
	{
		return sser.gstart(name);
	}
//	//select like end
	@GetMapping("getend/{name}")
	public List<Details2> gen(@PathVariable String name)
	{
		return sser.gend(name);
	}
	//update
	@PutMapping("update/{name}/{id}")
	public Integer ut(@PathVariable String name,@PathVariable String id)
	{
		return sser.updat(name,id);
	}
	//delete
	@DeleteMapping("del/{age}")
	public Integer de(@PathVariable int age)
	{
		return sser.del(age);
	}
}
