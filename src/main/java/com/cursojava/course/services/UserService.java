package com.cursojava.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cursojava.course.entities.User;
import com.cursojava.course.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository Repository;
	
	public List<User> findAll() {
		return Repository.findAll();
	}

	public User findById (Long id) {
		Optional<User> obj =  Repository.findById(id);
		return obj.get();
	}
}
