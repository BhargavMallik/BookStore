package com.lucky.bookstore.dao;

public class UserFactory 
{
	static UserDAO userDAO;
	
	static
	{
		userDAO = new UserDAOImpl();
	}
	
	public static UserDAO getUserDAO()
	{
		return userDAO;
	}
}
