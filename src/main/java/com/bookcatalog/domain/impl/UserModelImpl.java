package com.bookcatalog.domain.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bookcatalog.dao.UserDao;
import com.bookcatalog.domain.UserModel;

import javassist.tools.web.BadHttpRequest;

@Component
public class UserModelImpl implements UserModel {

	
	
	
	 String username;
	 String password;
	 String name;
	 String email;
	 
	//created date
	 Date createdDate;	 
	 //loyal if user created date before 3 years from current date
	 boolean loyal;
	 //if user is older then  10 year discount 10%, if 5 year older 5% if older then 3year 3%
	 Double loyalOfferDiscount;
	 
	 boolean newUser;
	 
	 @Autowired
	 UserDao userDao; 
	 
	



		@Override
		public List<UserModel> findAll() {
			return userDao.findAll();
		}



		@Override
		public UserModel findOne(String username) {
			return userDao.find(username);
		}



		@Override
		public UserModel create(UserModel user) {
			return userDao.create(user);
		}



		@Override
		public void delete(String username) {
			userDao.delete(username);
			
		}



		@Override
		public UserModel update(UserModel user) throws BadHttpRequest {
			return userDao.update(user);
			
		}



		@Override
		public String getUsername() {
			return username;
		}



		@Override
		public void setUsername(String username) {
			this.username = username;
			
		}



		@Override
		public String getPassword() {
			return password;
		}



		@Override
		public void setPassword(String password) {
			this.password=password;
			
		}



		@Override
		public String getName() {
			return name;
		}



		@Override
		public void setName(String name) {
			this.name = name;
			
		}



		@Override
		public String getEmail() {
			return email;
		}



		@Override
		public void setEmail(String email) {
			this.email = email;
			
		}



		
	 
	
	
}
