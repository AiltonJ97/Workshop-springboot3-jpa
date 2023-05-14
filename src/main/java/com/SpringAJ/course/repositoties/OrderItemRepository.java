package com.SpringAJ.course.repositoties;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringAJ.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
