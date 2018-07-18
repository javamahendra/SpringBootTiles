package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VendorController {

	@GetMapping("/home")
	public String show(ModelMap map) {

		map.addAttribute("msg", "Micro Service");
		return "home";
	}
	
	@GetMapping("/login")
	public String login(ModelMap map) {

		
		map.addAttribute("msg", "Micro Service");
		return "login";
	}

}
