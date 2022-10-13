package com.examportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.examportal.entity.User;

@Repository
public interface LoginDao extends JpaRepository<User,String>{
	
	@Query(value = "from user_mstr where username = :username and password = :password")
	User doLogin(@Param("username") String username,@Param("password") String passsword);
}
