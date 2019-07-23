package com.amdocs.amdocshellorestapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class helloRestController {

	@GetMapping("/hello")
	public String sayHello()
	{
		return "Hello REST API !!!";
	}
}