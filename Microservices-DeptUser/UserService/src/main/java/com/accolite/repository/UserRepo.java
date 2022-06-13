package com.accolite.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.accolite.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long>{

	User findByUserId(Long id);

}
