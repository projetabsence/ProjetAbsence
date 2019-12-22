package com.absence.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@GetMapping("")
	public @ResponseBody String home() {
		return "Authenticated ...";
	}
	
}
