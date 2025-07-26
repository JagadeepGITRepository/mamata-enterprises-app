package com.mit.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MamataEnterprisesController {

	@GetMapping("/welcome")
	public ResponseEntity<String> getMessage(){
		String welcomeMsg="Welcome to Mamata Enterprises ...";
		return new ResponseEntity(welcomeMsg, HttpStatus.OK);
		
	}
	
}
