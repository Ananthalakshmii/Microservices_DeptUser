package com.accolite;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {
	
	@GetMapping("/userServiceFallBack")
	public String userServiceFallBackMethod() {
		return "User service taking too long to respond. Try again later";
	}

	@GetMapping("/departmentServiceFallBack")
	public String departmentServiceFallBackMethod() {
		return "Department service taking too long to respond. Try again later";
	}
}
