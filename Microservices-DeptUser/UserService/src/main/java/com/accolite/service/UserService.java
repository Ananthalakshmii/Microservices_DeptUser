package com.accolite.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.accolite.entity.User;
import com.accolite.repository.UserRepo;
import com.accolite.valueobject.Department;
import com.accolite.valueobject.RestTemplateVO;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {
	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private RestTemplate restTemplate;

	public User saveUser(User user) {
		log.info("inside save user in service");
		return userRepo.save(user);
}

	public RestTemplateVO getUserWithDepartment(Long id) {
		RestTemplateVO vo=new RestTemplateVO();
		
		User user=userRepo.findByUserId(id);
		log.info("user-------"+user);
		//Department department=restTemplate.getForObject("http://localhost:9001/department/"+user.getDepartmentId(), Department.class);
		Department department=restTemplate.getForObject("http://DEPARTMENT-SERVICE/department/"+user.getDepartmentId(), Department.class);
		
		
		vo.setUser(user);
		vo.setDepartment(department);
		
		return vo;
	}

}
