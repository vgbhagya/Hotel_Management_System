package com.ltts.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	
	@Id
	String userMailid;
	String userName;
	String mobNo;
	String password;
	String address;
	
	
	
	public User() {
	}
	
	public User(String userMailid, String userName, String mobNo, String password, String address) {
		this.userMailid = userMailid;
		this.userName = userName;
		this.mobNo = mobNo;
		this.password = password;
		this.address = address;
	}
	
	public String getUserMailid() {
		return userMailid;
	}
	public void setUserMailid(String userMailid) {
		this.userMailid = userMailid;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getMobNo() {
		return mobNo;
	}
	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "User [" + this.getUserName() + "," + this.getUserMailid() + "," + this.getMobNo() +"," + this.getAddress() + "]";
	}

}
