package com.user.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.entities.UserProfile;

public interface UserProfileRespository extends JpaRepository<UserProfile, Integer>{

}
