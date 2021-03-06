package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SpeakerController {

	@Autowired
	private SpeakerRepository repository;
	
	@GetMapping("/speakers")
	public String list(Model model) {
		model.addAttribute("speakers", this.repository.findAll());
		return "speakers";
	}
	
}
