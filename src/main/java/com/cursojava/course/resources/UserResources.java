package com.cursojava.course.resources;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cursojava.course.entities.User;

@RestController
//@RequestMapping(value = "/users")
@RequestMapping(value = "/users", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
public class UserResources {
	@GetMapping
	public ResponseEntity<User>  findAll() {
		User u = new User (1L, "maria", "maria@gmail.com",  "912345678", "12345" );
		return ResponseEntity.ok().body(u);
	}
}
