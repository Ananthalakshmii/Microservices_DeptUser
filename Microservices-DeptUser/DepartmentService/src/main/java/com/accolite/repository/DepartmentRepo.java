package com.accolite.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.accolite.entity.Department;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Long>{

	Optional<Department> findByDepartmentId(Long id);

}
