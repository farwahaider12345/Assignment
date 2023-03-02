package com.user.service;

import com.user.entities.Users;

public interface UserService {

	public String createUser(Users user);

	public Users getUser(int id);

	public Users updateUser(int id, Users users);

	public String deleteUser(int id);
}
