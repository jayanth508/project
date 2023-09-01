package com.example.ovp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.ovp.model.Details1;
import com.example.ovp.service.Service1;

@RestController
public class Controller1 {
	@Autowired
    Service1 sser;
	@PostMapping("post1")
	public List<Details1> post1info(@RequestBody List<Details1> ss)
	{
		return sser.saveinfo(ss);
	}
	@GetMapping("get1")
	public List<Details1> get1info()
	{
		return sser.showinfo();
	}
	@DeleteMapping("delete1/{mailid}")
	public String deleteinf(@PathVariable String mailid)
	{
		return sser.deleteinfo(mailid);
	}

}
