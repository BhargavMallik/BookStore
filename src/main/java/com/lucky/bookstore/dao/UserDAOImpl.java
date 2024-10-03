package com.lucky.bookstore.dao;

import com.lucky.bookstore.to.UserTo;
import com.lucky.bookstore.util.JdbcTemplate;

public class UserDAOImpl implements UserDAO
{

	@Override
	public int registerUser(UserTo userTo) 
	{
		System.out.println("Register User ");
		String SQL = "insert into myusers(fullName, email, phone, dob, city, userName, password, status) values(?,?,?,?,?,?,?,?)";
		int x = JdbcTemplate.update(SQL, userTo.getFullName(), userTo.getEmail(), userTo.getPhone(), userTo.getDob(), userTo.getCity(), userTo.getUserName(), userTo.getPassword(), userTo.getStatus()); 
		return x;
	}

	@Override
	public UserTo verifyUser(String userName, String password) 
	{
		String SQL = "select * from myusers where userName = ? and password = ?";
		Object obj = (UserTo) JdbcTemplate.queryForObject(SQL, new UserRowMapper(), userName, password);
		return (UserTo) obj;
	}

	@Override
	public String getPassword(String email) 
	{
		String SQL = "select * from myusers wher email = ?";
		UserTo userTo = (UserTo) JdbcTemplate.queryForObject(SQL, new UserRowMapper(), email);
		return userTo.getPassword();
	}

	@Override
	public int updatePassword(String email, String newPassword) 
	{
		String SQL = "update myusers set password = ? where email = ?";
		int x = JdbcTemplate.update(SQL, newPassword, email);
		return x;
	}

	@Override
	public int updateProfile(UserTo userTo) 
	{
		String SQL = "update myusers set fullName = ?, email = ?, phone = ?, city = ? where userId = ?";
		int x = JdbcTemplate.update(SQL, userTo.getFullName(), userTo.getEmail(), userTo.getPhone(), userTo.getCity(), userTo.getUserId());
		return x;
	}

}
