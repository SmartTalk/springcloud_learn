package com.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.service.HelloService;
@Service("helloService")
public class HelloServiceImpl implements HelloService {
	@Autowired
	RestTemplate restTemplate;
	@Override
	public String hiService(String name) {
		// TODO Auto-generated method stub
		return restTemplate.getForObject("http://SERVICE-HI/hi?name="+name,String.class);
	}

}
