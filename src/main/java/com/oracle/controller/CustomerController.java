package com.oracle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerController {
	
	@GetMapping(path="/sayHello")
	public String sayHello() {
		return "customer"; // this will return /WEB-INF/views/customer.jsp
							// i.e. this customer is actually returning the customer.jsp file present in the views folder
							// this is how when a user will go to the http://localhost:8080/spring-mvc/sayHello
							// he'll see the customer.jsp page as it'll get rendered by the spring auto view resolver 
	}
}
