package com.SpringAJ.course.repositoties;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringAJ.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
