package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.classes.RiskInfo;
import com.example.demo.classes.User;
import com.example.demo.classes.Vehicle;

@Controller
public class homeController {
	
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	
}
