package com.zhaojiqiang.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/one")
public class HelloWorldController {
	
	
		@RequestMapping("/hello")
		public String hello() {
			return "helloworld";
		}

}
