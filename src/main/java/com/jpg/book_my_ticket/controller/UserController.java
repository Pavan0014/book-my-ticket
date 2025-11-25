package com.jpg.book_my_ticket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
  
	@GetMapping("/")
	public String loadMain() {
		return "main.html";
	}
	
}
