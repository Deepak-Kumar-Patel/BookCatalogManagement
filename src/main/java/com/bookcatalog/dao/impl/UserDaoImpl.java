package com.bookcatalog.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bookcatalog.dao.UserDao;
import com.bookcatalog.domain.UserModel;
import com.bookcatalog.entity.UserEntity;
import com.bookcatalog.repository.UserRepository;
import com.bookcatalog.transform.model.UserTransformer;

import javassist.tools.web.BadHttpRequest;

@Component
public class UserDaoImpl implements UserDao {

	@Autowired
	private UserRepository repository;
	
	
	public List<UserModel> findAll(){
		return UserTransformer.getUserModelFromEntityList(repository.findAll());
	}
	public UserModel find(String username) {
		return UserTransformer.getUserModelFromEntity(repository.findOne(username));
	};
	public UserModel create(UserModel user) {
		
		UserEntity ue =UserTransformer.getUserEntityFromUserModel(user);
		UserEntity userEntity = repository.save(ue);
		return UserTransformer.getUserModelFromEntity(userEntity);
	}
	public void delete(String username) {
		repository.delete(username);
	};
	public UserModel update(UserModel user) throws BadHttpRequest{
		UserEntity ue =UserTransformer.getUserEntityFromUserModel(user);
		UserEntity userEntity = repository.save(ue);
		return UserTransformer.getUserModelFromEntity(userEntity);
	}
	
	
	
	
}
