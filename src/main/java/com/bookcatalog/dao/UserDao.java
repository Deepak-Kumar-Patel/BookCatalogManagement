package com.bookcatalog.dao;

import java.util.List;

import com.bookcatalog.domain.UserModel;

import javassist.tools.web.BadHttpRequest;

public interface UserDao {

	public List<UserModel> findAll();
	public UserModel find(String username);
	public UserModel create(UserModel user) ;
	public void delete(String username);
	public UserModel update(UserModel user) throws BadHttpRequest;
}
