package cl.farenas.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.farenas.domain.HelloWorldBean;

@RestController
public class HelloWorldController {
	
	@RequestMapping("/hello-world-bean")
	public HelloWorldBean message() {
		return new HelloWorldBean("Hello World Bean");
	}

}
