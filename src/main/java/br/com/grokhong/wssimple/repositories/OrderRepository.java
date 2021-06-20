package br.com.grokhong.wssimple.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.grokhong.wssimple.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
