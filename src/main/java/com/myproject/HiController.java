package com.myproject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
	
	@RequestMapping("/hi")
	public String showHi() {
		return "Hi Welcocme to Springboot";
	}
	
	@RequestMapping("/hello")
	public String shoeHello() {
		return "Hello welcome to springboot";
	}
}
