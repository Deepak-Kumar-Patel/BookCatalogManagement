package com.bookcatalog.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bookcatalog.domain.UserModel;
import com.bookcatalog.service.UserService;

import javassist.tools.web.BadHttpRequest;

@Component
public class UserServiceImpl implements UserService {

	@Autowired
	UserModel userModel;
	
	public List<UserModel> findAll(){
		return userModel.findAll();
	}
	public UserModel findOne(String username) {
		return userModel.findOne(username);
	}
	public UserModel create(UserModel user) {
		return userModel.create(user);
	}
	public void delete(String username) {
		userModel.delete(username);
	}
	public UserModel update(String username, UserModel user) throws BadHttpRequest{
		UserModel ud = userModel.update(user);
		if(ud != null) {
			user = userModel.update(user);
		}else {
			throw new BadHttpRequest();
		}
		return user;
	}
	
	
	
}
