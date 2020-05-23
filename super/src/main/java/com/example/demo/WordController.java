package com.example.demo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@EnableAutoConfiguration

public class WordController {
	@RequestMapping("/word")
	//@RequestBody
	public String sayWord() {
		return "World of Word";

	}

}
