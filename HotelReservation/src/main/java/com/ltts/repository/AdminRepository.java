package com.ltts.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ltts.Entity.Admin;

public interface AdminRepository extends JpaRepository <Admin, String>{

	@Query("select a from admin a where a.adminUserName=?1 and a.adminPassword=?2")
	public static boolean findUser(String adminUserName, String adminPassword){
		return false;
	}
	
}
