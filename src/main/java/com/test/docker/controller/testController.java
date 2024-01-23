package com.test.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class testController {

	@GetMapping("check")
	public String test() {
		return "Api endpoint tested inside docker";
	}
}
