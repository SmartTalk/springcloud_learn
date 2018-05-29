package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient //也可以使用@EnableDiscoveryClient 支持其他服务发现组件 如zk 
@SpringBootApplication
@RestController
public class EurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientApplication.class, args);
	}
	
	@Value("${server.port}")
	private String port;
	
	@GetMapping("/hi")
	public String home(String name){
		return "hi "+name+",i am from port"+port;
	}
}
