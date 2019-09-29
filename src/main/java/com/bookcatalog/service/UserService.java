package com.bookcatalog.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bookcatalog.domain.UserModel;

import javassist.tools.web.BadHttpRequest;

@Service
public interface UserService {

	public List<UserModel> findAll();
	public UserModel findOne(String username);
	public UserModel create(UserModel userModel) ;
	public void delete(String username);
	public UserModel update(String username, UserModel useModel) throws BadHttpRequest;
}
