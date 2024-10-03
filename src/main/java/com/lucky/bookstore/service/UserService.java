package com.lucky.bookstore.service;

import com.lucky.bookstore.to.UserTo;

public interface UserService 
{
	
	public int registerUser(UserTo userTo);
	public UserTo verifyUser(String userName, String password);
	public String getPassword(String email);
	public int updatePassword(String email, String newPassword);
	public int updateProfile(UserTo userTo);
	

}
