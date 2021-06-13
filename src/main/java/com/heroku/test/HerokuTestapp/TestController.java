package com.heroku.test.HerokuTestapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping(value = "/test")
	public String test(@RequestParam(required = false, defaultValue = "") String name) {
		return "Service working " + name + " " + System.currentTimeMillis();
	}
}
