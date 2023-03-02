package com.user.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	@Column(length = 50)
	private String userName;
	
	@OneToMany(mappedBy = "users")  //users_userId
	@JsonIgnoreProperties("users")
	private List<UserProfile> userProfile;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	

	public List<UserProfile> getUserProfile() {
		return userProfile;
	}

	public void setUserProfile(List<UserProfile> userProfile) {
		this.userProfile = userProfile;
	}

	

	public Users(int userId, String userName, List<UserProfile> userProfile) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userProfile = userProfile;
	}

	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Users [userId=" + userId + ", userName=" + userName + ", userProfile=" + userProfile + "]";
	}
	
	
}
