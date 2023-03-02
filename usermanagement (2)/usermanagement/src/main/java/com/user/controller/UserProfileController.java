package com.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.user.entities.UserProfile;
import com.user.service.UserProfileService;

@RestController
public class UserProfileController {

	@Autowired
	UserProfileService userProfileService;

	@PostMapping("/api/createUserProfile")
	public String createUser(@RequestBody UserProfile userProfile) {
		System.out.println("user profile controller");
		return userProfileService.createUserProfile(userProfile);
	}

	@GetMapping("/api/getUserProfile/{id}")
	public UserProfile getUserProfile(@PathVariable int id) {
		return userProfileService.getUserProfile(id);
	}

	@PutMapping("/api/updateUserProfile/{id}")
	public UserProfile updateUserProfile(@PathVariable int id, @RequestBody UserProfile userProfile) {
		return userProfileService.updateUserProfile(id, userProfile);
	}

	@DeleteMapping("/api/deleteUserProfile/{id}")
	public String deleteUserProfile(@PathVariable int id) {
		return userProfileService.deleteUserProfile(id);
	}
}
