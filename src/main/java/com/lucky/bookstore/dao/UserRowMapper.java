package com.lucky.bookstore.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.lucky.bookstore.to.UserTo;
import com.lucky.bookstore.util.RowMapper;

public class UserRowMapper implements RowMapper
{

	@Override
	public Object mapRow(ResultSet rs) throws SQLException 
	{
		UserTo userTo = new UserTo();
		
		userTo.setUserId(rs.getInt(1));
		userTo.setFullName(rs.getString(2));
		userTo.setEmail(rs.getString(3));
		userTo.setPhone(rs.getString(4));
		userTo.setDob(rs.getString(5));
		userTo.setCity(rs.getString(6));
		userTo.setUserName(rs.getString(7));
		userTo.setPassword(rs.getString(8));
		userTo.setStatus(rs.getString(9));
		
		return userTo;
	}

}
