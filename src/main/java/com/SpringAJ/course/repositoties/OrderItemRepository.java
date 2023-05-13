package com.SpringAJ.course.repositoties;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringAJ.course.entities.OrderItem;
import com.SpringAJ.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{
	
}
