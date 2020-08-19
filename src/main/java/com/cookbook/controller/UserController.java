package com.cookbook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cookbook.model.*;

import com.cookbook.service.UserService;

@RestController
@CrossOrigin
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	UserService us;
	
	@GetMapping("")
	public List<User> getAllUsers() {
		return us.findAllUsers();
	}
	
	@PostMapping("")
	public User  createUser(@RequestBody User u) {
		return us.createUser(u);
	}
	
	@DeleteMapping("/{id}")
	public String deleteById(@PathVariable int id) {		
		return us.deleteUser(id);	
	}
	
	@PutMapping("") 
	public User updateUser(@RequestBody User u) {
		return us.updateUser(u);
	}
	
	@GetMapping("/{id}")
	public User getUserById(@PathVariable int id) {
		return us.getOneUser(id);
	}
	
}
