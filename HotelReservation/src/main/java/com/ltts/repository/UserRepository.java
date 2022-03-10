package com.ltts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ltts.Entity.User;

public interface UserRepository extends JpaRepository<User, String> {

	
	@Query("select u from user u where u.userMailId = ?1 and u.password = ?2")
	public static boolean findUser(String userName, String password) {
		// TODO Auto-generated method stub
		return true;
	}

}
