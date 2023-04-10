package com.sf.evs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class DemoController {
@GetMapping("Welcome/{name}")	
public String meth1(@PathVariable String name) {
	return "hai "+name+" Welcome to springboot";
	
}

}
