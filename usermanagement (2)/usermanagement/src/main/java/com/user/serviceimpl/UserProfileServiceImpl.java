package com.user.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.entities.UserProfile;
import com.user.repositories.UserProfileRespository;
import com.user.service.UserProfileService;

@Service
public class UserProfileServiceImpl implements UserProfileService {

	@Autowired
	UserProfileRespository userProfileRespository;

	@Override
	public String createUserProfile(UserProfile userProfile) {
		if (userProfile != null) {
			userProfileRespository.save(userProfile);
			return "success";
		}

		return "error failed";
	}

	@Override
	public UserProfile getUserProfile(int id) {
		return userProfileRespository.getById(id);
	}

	@Override
	public UserProfile updateUserProfile(int id, UserProfile userProfile) {
		UserProfile foundUser = userProfileRespository.getById(id);
		foundUser.setFisrtName(userProfile.getFisrtName());
		foundUser.setLastName(userProfile.getLastName());
		userProfileRespository.save(foundUser);
		return foundUser;
	}

	@Override
	public String deleteUserProfile(int id) {
		UserProfile foundUser = userProfileRespository.getById(id);
		if (foundUser != null) {
			userProfileRespository.deleteById(id);
			return "deleted successfully";
		}
		return "Not Deleted";
	}

}
