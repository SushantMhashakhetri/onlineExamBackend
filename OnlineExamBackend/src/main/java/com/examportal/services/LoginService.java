package com.examportal.services;


import com.examportal.entity.User;

public interface LoginService {
	boolean isUsernameExist(String username);
	boolean doLogin(User user);
	User getUser(String username);
	boolean register(User user);
}
