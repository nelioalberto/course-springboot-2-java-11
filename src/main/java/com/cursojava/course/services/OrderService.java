package com.cursojava.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cursojava.course.entities.Order;
import com.cursojava.course.entities.User;
import com.cursojava.course.repositories.OrderRepository;
import com.cursojava.course.repositories.UserRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository Repository;
	
	public List<Order> findAll() {
		return Repository.findAll();
	}

	public Order findById (Long id) {
		Optional<Order> obj =  Repository.findById(id);
		return obj.get();
	}
}