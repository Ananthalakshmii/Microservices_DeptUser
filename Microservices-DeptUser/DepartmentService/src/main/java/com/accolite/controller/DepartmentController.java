package com.accolite.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accolite.entity.Department;
import com.accolite.service.DepartmentService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/department")
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department department) {
		log.info("inside save department of department controller");
		return departmentService.saveDepartment(department);
		
	}
	
	@GetMapping("/{id}")
	public Optional<Department> getDepartmentById(@PathVariable Long id) {
		log.info("inside get dept by id of controller");
		return departmentService.getDepartmentById(id);
	}
	
	
	
	

}
