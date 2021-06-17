package com.cursojava.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cursojava.course.entities.Category;
import com.cursojava.course.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository Repository;
	
	public List<Category> findAll() {
		return Repository.findAll();	
	}

	public Category findById (Long id) {
		Optional<Category> obj =  Repository.findById(id);
		return obj.get();
	}
}
