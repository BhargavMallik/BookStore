package com.lucky.bookstore.to;

public class UserTo 
{
	private int userId;
	private String fullName;
	private String email;
	private String phone;
	private String dob;
	private String city;
	private String userName;
	private String password;
	private String status;
	
	
	public UserTo() {}
	
	public UserTo(String fullName, String email, String phone, String dob, String city, String userName,
			String password) 
	{
		super();
		this.fullName = fullName;
		this.email = email;
		this.phone = phone;
		this.dob = dob;
		this.city = city;
		this.userName = userName;
		this.password = password;
	}



	public UserTo(int userId, String fullName, String email, String phone, String dob, String city, String userName,
			String password, String status) 
	{
		super();
		this.userId = userId;
		this.fullName = fullName;
		this.email = email;
		this.phone = phone;
		this.dob = dob;
		this.city = city;
		this.userName = userName;
		this.password = password;
		this.status = status;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
}
