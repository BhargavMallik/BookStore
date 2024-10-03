package com.lucky.bookstore.dao;

import com.lucky.bookstore.to.UserTo;

public interface UserDAO 
{
	
	public int registerUser(UserTo userTo);
	public UserTo verifyUser(String userName, String password);
	public String getPassword(String email);
	public int updatePassword(String email, String newPassword);
	public int updateProfile(UserTo userTo);
	

}
