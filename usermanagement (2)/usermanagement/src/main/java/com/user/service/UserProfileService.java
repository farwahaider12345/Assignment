package com.user.service;

import com.user.entities.UserProfile;

public interface UserProfileService {
	public String createUserProfile(UserProfile userProfile);

	public UserProfile getUserProfile(int id);

	public UserProfile updateUserProfile(int id, UserProfile userProfile);

	public String deleteUserProfile(int id);
}
