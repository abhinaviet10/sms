package com.abhinav.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/helloWorld")
public class HelloWorldController {
	
	@Autowired
	org.springframework.context.ApplicationContext applicationContext;
	@RequestMapping("/hello.html")
    public ModelAndView helloWorld() {
		BeanTest bt=(BeanTest)applicationContext.getBean("test");
		System.out.println("message the bean name will be "+bt.getName());
        String message = "Hello World, Spring 3.0!";
        return new ModelAndView("home/hello", "message", message);
    }	
}
