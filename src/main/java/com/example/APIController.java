package com.example;

import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class APIController {
	
	@RequestMapping(method = {RequestMethod.GET}, value = {"/customer"})
	public Customer getEmployee(HttpServletResponse response) {
		return new Customer("John","Doe","***-**-","AustinTX");
	}

}