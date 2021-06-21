package br.com.grokhong.wssimple.services;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.grokhong.wssimple.entities.User;
import br.com.grokhong.wssimple.repositories.UserRepository;
import br.com.grokhong.wssimple.services.exceptions.ResourceNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public List<User> findAll() {
		return repository.findAll();
	}

	public User findById(Long id) {
		Optional<User> obj = Optional.ofNullable(repository.findById(id).orElse(null));
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}

	public User insert(User obj) {
		return repository.save(obj);
	}

	public void delete(Long id) {
		repository.deleteById(id);
	}

	public User update(Long id, User obj) {
		User entity = repository.getById(id);
		updatedData(entity, obj);
		return repository.save(entity);
	}

	private void updatedData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
	}
}
