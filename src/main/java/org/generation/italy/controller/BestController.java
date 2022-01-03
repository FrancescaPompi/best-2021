package org.generation.italy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class BestController {

	@GetMapping
	public String bestOf(Model model) {
		model.addAttribute("name", "Francesca");
		
		return "bestOf";
	}
	
	
}
