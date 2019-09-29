package com.bookcatalog.domain;

import java.util.List;

import org.springframework.stereotype.Component;

import javassist.tools.web.BadHttpRequest;

@Component
public interface UserModel {

	
	public List<UserModel> findAll();
	public UserModel findOne(String username);
	public UserModel create(UserModel user) ;
	public void delete(String username);
	public UserModel update(UserModel user) throws BadHttpRequest;
	
	public String getUsername();
	public void setUsername(String username);
	public String getPassword();
	public void setPassword(String password);
	public String getName() ;
	public void setName(String name);
	public String getEmail();
	public void setEmail(String email);
	
	//boolean isSeasonalOfferPresent();
	//Double seasonalOffer();
	

	
}
