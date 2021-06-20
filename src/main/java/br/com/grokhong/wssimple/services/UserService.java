package br.com.grokhong.wssimple.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.grokhong.wssimple.entities.User;
import br.com.grokhong.wssimple.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;

	public List<User> findAll() {
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = Optional.of(repository.getById(id));
		return obj.get();
	}
	
	public User insert(User obj) {
		return repository.save(obj);
	}
}
