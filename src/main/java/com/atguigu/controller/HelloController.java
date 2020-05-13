package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@RequestMapping("/")
	@ResponseBody
	public String hello() {
		return "<h1 style='color:red;'>Hello Index!!</h1>";
	}
	
	@RequestMapping("/hello")
	@ResponseBody
	public String hello2() {
		return "<h1 style='color:red;'>Hello World!!</h1>";
	}
	
}
