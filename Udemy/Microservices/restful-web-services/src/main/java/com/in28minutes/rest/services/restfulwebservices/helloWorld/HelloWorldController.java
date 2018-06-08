package com.in28minutes.rest.services.restfulwebservices.helloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping(method=RequestMethod.GET, path="/hello-world1")
	public String helloWorld1() {
		return"Hello World !!!";
	}
	@GetMapping( path="/hello-world2")
	public String helloWorld2() {
		return"Hello World !!!";
	}
	@GetMapping( path="/hello-world3")
	public HelloWorldBean helloWorld3() {
		return new HelloWorldBean("Hello World !!!");
	}
	@GetMapping( path="/hello-world4/{name}")
	public HelloWorldBean helloWorld4(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello %s",name));
	}
}