package com.ty.springboot2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ty.springboot2.dto.ResponseStructure;
import com.ty.springboot2.dto.User;
import com.ty.springboot2.service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService userService;

//save user
	@PostMapping("/users")
	public ResponseStructure<User> saveUser(@RequestBody User user) {
		return userService.saveUser(user);
	}

//get by id
	@GetMapping("/users/{id}")
	public ResponseStructure<User> getUserById(@PathVariable int id) {
		return userService.getUserById(id);
	}

//	//get all users
	@GetMapping("/users")
	public ResponseStructure<List<User>> getAllusers() {
		return userService.getAllusers();
	}

	// update by id
	@PutMapping("/users/{id}")
	public ResponseStructure<User> updateUser(@PathVariable int id, @RequestBody User user) {
		return userService.updateUser(id, user);
	}

	// delete
	@DeleteMapping("/users/{id}")
	public ResponseStructure<String> deleteUser(@PathVariable int id) {
		return userService.deleteUser(id);
	}

}
