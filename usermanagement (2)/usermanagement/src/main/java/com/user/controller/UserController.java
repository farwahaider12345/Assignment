package com.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.user.entities.Users;
import com.user.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;

	@PostMapping("/api/createUser")
	public String createUser(@RequestBody Users user) {
		return userService.createUser(user);
	}

	@GetMapping("/api/getUser/{id}")
	public Users getUser(@PathVariable int id) {
		return userService.getUser(id);
	}

	@PutMapping("/api/updateUser/{id}")
	public Users updateUser(@PathVariable int id, @RequestBody Users users) {
		return userService.updateUser(id, users);
	}

	@DeleteMapping("/api/deleteUser/{id}")
	public String deleteUser(@PathVariable int id) {
		return userService.deleteUser(id);
	}
}
