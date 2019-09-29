package com.bookcatalog.domain.impl;

import org.springframework.stereotype.Component;

import com.bookcatalog.domain.AuthorModel;

@Component
public class AuthorModelImpl implements AuthorModel {

	
	
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
