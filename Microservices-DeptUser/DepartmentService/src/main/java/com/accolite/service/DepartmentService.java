package com.accolite.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accolite.entity.Department;
import com.accolite.repository.DepartmentRepo;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {
	
	@Autowired
	private DepartmentRepo departmentRepo;

	public Department saveDepartment(Department department) {
		log.info("inside save department of dept service");
		return departmentRepo.save(department);
	}

	public Optional<Department> getDepartmentById(Long id) {
		log.info("inside get dept by id in service");
		return departmentRepo.findByDepartmentId(id);
	}

}
