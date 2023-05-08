package com.SpringAJ.course.repositoties;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringAJ.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
