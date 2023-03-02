package com.user.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.entities.Users;
import com.user.repositories.UserRepository;
import com.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public String createUser(Users user) {
		String message = null;
		if (user != null) {

			userRepository.save(user);
			message = "user saved successfully!";
		}
		return message;
	}

	@Override
	public Users getUser(int id) {
		return userRepository.getById(id);
	}

	@Override
	public Users updateUser(int id, Users users) {
		Users foundUser = userRepository.getById(id);
		foundUser.setUserName(users.getUserName());
		userRepository.save(foundUser);
		return foundUser;
	}

	@Override
	public String deleteUser(int id) {
		Users foundUser = userRepository.getById(id);
		if (foundUser != null) {
			userRepository.deleteById(id);
			return "deleted successfully";
		}
		return "Not Deleted";
	}

}
