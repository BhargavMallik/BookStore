package com.lucky.bookstore.service;

import com.lucky.bookstore.dao.UserDAO;
import com.lucky.bookstore.dao.UserFactory;
import com.lucky.bookstore.to.UserTo;

public class UserServiceImpl implements UserService
{

	@Override
	public int registerUser(UserTo userTo)
	{
		System.out.println("Register Service ");
		UserDAO userDAO = UserFactory.getUserDAO();
		return userDAO.registerUser(userTo);
	}

	@Override
	public UserTo verifyUser(String userName, String password) 
	{
		UserDAO userDAO = UserFactory.getUserDAO();
		return userDAO.verifyUser(userName, password);
	}

	@Override
	public String getPassword(String email) 
	{
		UserDAO userDAO = UserFactory.getUserDAO();
		return userDAO.getPassword(email);
	}

	@Override
	public int updatePassword(String email, String newPassword) 
	{
		UserDAO userDAO = UserFactory.getUserDAO();
		return userDAO.updatePassword(email, newPassword);
	}

	@Override
	public int updateProfile(UserTo userTo) 
	{
		UserDAO userDAO = UserFactory.getUserDAO();
		return userDAO.updateProfile(userTo);
	}

}
