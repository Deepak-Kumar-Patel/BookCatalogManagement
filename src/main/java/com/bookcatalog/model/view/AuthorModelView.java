package com.bookcatalog.model.view;

import java.io.Serializable;


public class AuthorModelView implements Serializable {

	
	private static final long serialVersionUID = 1L;
	private Long authId;
	private String name;
	private String email;
	
	
	public Long getAuthId() {
		return authId;
	}
	public void setAuthId(Long authId) {
		this.authId = authId;
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

	
}
