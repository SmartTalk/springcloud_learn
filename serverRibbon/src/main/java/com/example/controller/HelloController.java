package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.HelloService;

@RestController
public class HelloController {
	@Autowired
	HelloService helloService;
	
	@GetMapping("/hi")
	public String hi(String name){
		return helloService.hiService(name);
	}
}
