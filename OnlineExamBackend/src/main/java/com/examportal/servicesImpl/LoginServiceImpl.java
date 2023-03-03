package com.examportal.servicesImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examportal.entity.User;
import com.examportal.repository.LoginDao;
import com.examportal.services.LoginService;

@Service
public class LoginServiceImpl implements LoginService{
	
	@Autowired
	LoginDao loginDao;
	

	@Override
	public boolean isUsernameExist(String username) {
		return loginDao.existsById(username);
	}

	@Override
	public boolean doLogin(User user) {
		User tempUser = loginDao.doLogin(user.getUsername(), user.getPassword());
		if(tempUser == null)
			return false;
		return true;
	}

	@Override
	public User getUser(String username) {
		User user = loginDao.findById(username).get();
		user.setPassword(null);
		return user;
	}

	@Override
	public boolean register(User user) {
		User u = loginDao.save(user);
		if(u !=null)
			return true;
		return false;
	}



}
