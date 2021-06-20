package br.com.grokhong.wssimple.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.grokhong.wssimple.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
