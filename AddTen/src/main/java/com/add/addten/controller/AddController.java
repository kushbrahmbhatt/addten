package com.add.addten.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.add.addten.entity.Sum;

@RestController
@RequestMapping("/")
public class AddController {
	
	@GetMapping()
	public String getHello() {
		return "Hello";
	}
	
	@GetMapping("/{num}")
	public Sum getSum(@PathVariable int num) {
		int sum = Sum.addTen(num);
		return new Sum(sum);
	}
	
	@GetMapping("/{num1}/{num2}")
	public Sum getSum(@PathVariable int num1, @PathVariable int num2) {
		int sum = Sum.addTwoNumbers(num1, num2);
		return new Sum(sum);
	}

}
