package com.gautam.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GautamController {
	@GetMapping(path = "/")
	public String index() {
		return "Hello Gautam!";
	}
	@GetMapping(path = "/{name}")
	public String name(@PathVariable String name){
		return "Hello "+name;
	}
}
