package com.examportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.examportal.entity.User;
import com.examportal.entity.Branch;
import com.examportal.services.BranchService;
import com.examportal.services.LoginService;


@RestController
@CrossOrigin("*")
public class LoginController {
	
	@Autowired 
	LoginService loginService;
	
	@Autowired
	BranchService branchService;
	
	@PostMapping("/login")
	public boolean doLogin(@RequestBody User user) {
		return loginService.doLogin(user);
	}
	
	@GetMapping("/login/{username}")
	public User getUser(@PathVariable String username) {
		return loginService.getUser(username);
	}
	
	@GetMapping("/branch")
	public List<Branch> getBranches(){
		return branchService.getBranches();
	}
	
	@PostMapping("/register")
	public boolean register(@RequestBody User user) {
		if(loginService.isUsernameExist(user.getUsername()))
			return false;
		return loginService.register(user);
	}
}
