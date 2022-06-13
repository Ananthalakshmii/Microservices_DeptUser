package com.accolite.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.accolite.entity.User;
import com.accolite.service.UserService;
import com.accolite.valueobject.RestTemplateVO;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/")
	public User saveUser(@RequestBody User user) {
		log.info("inside save user in controller");
		return userService.saveUser(user);
	}
	
	@GetMapping("/{id}")
	public RestTemplateVO getUserWithDepartment(@PathVariable Long id) {
		log.info("inside get user with department in controller");
		return userService.getUserWithDepartment(id);
	}

}
