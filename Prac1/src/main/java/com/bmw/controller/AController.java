package com.bmw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AController {
	
	@RequestMapping(path = "/hello")
	public String aa() {
		return "home";
	}
	@RequestMapping(path="/aa")
	@ResponseBody
	public String hh() {
		return "Welcome to the jungle";
	}

}
