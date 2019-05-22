package cn.tedu.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/hello/{name}/{age}")
	public String hello(@PathVariable("name") String name,@PathVariable("age") String age) {
		return "1 springboot hello "+ name +" " + age;
	}
}
