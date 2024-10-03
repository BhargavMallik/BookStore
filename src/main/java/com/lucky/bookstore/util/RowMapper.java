package com.lucky.bookstore.util;

import java.sql.*;

public interface RowMapper
{
	public Object mapRow(ResultSet rs) throws SQLException;

}
