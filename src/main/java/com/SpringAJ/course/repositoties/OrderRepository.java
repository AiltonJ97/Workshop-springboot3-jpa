package com.SpringAJ.course.repositoties;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringAJ.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
