package com.SpringAJ.course.repositoties;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringAJ.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
