package br.com.grokhong.wssimple.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.grokhong.wssimple.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
