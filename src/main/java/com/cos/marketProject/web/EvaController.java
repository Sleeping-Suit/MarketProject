package com.cos.marketProject.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EvaController {

	@GetMapping("/eva")
	public String youtubeEva() {
		return "youtube/youtubeEva";
	}
}
