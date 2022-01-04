package org.generation.italy.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class BestController {

	@GetMapping
	// model è la mappa di attributi che fa da collante tra la logica e l'interfaccia
	public String bestOf(Model model) {
		model.addAttribute("name", "Francesca");
		
		return "bestOf";
	}
	
	@GetMapping("/movies")
	public String movies(Model model) {
		model.addAttribute("title", "Movies");
		model.addAttribute("list", Arrays.asList("House of Gucci", "Crudelia", "Dune", "No time to die", "Eternals", "Spider-man - No way home"));

		return "list";		
	}
	
	@GetMapping("/songs")
	public String songs(Model model) {
		model.addAttribute("title", "Songs");
		model.addAttribute("list", Arrays.asList("Saturday - Twenty One Pilots", "Take My Brath - The Weekend", "Dopamine - Purple Disco Machine", "Easy On Me - Adele"));
		
		return "list";		
	}
	
}
