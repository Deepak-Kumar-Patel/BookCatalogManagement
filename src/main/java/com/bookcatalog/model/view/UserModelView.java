package com.bookcatalog.model.view;

import java.io.Serializable;


public class UserModelView  implements Serializable {

	
	private static final long serialVersionUID = -3367373787773201986L;
	private String username;
	private String password;
	private String name;
	private String email;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User{" + "username='" + username + '\'' + ", password='" + password + '\'' + ", name='" + name + '\''
				+ ", email='" + email + '\'' + '}';
	}
}
