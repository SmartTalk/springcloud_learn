package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.feign.SchedualServiceHi;

@RestController
public class HiController {
	@Autowired
	SchedualServiceHi schedualServiceHi;
	
	@RequestMapping(value="/hi",method=RequestMethod.GET)
	public String sayHi(@RequestParam String name){
		return schedualServiceHi.sayHiFromOneClient(name);
	}
}
