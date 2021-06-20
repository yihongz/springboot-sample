package br.com.grokhong.wssimple.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.grokhong.wssimple.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
