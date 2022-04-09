package com.example.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class TestController {
	
	@GetMapping("/getTest")
	public String getSaluto(@RequestParam Integer token) {
		
		String result ="TOKEN: ";
		
		return result + token;
	}

}
