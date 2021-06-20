package br.com.grokhong.wssimple.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.grokhong.wssimple.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
