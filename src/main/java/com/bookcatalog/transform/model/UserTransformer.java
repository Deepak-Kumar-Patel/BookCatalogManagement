package com.bookcatalog.transform.model;

import java.util.ArrayList;
import java.util.List;

import com.bookcatalog.domain.UserModel;
import com.bookcatalog.domain.impl.UserModelImpl;
import com.bookcatalog.entity.UserEntity;
import com.bookcatalog.model.view.UserModelView;

public class UserTransformer {

	
public static UserModel getUserModelFromEntity(UserEntity userEntity) {
	UserModel userModel= new UserModelImpl();
	userModel.setEmail(userEntity.getEmail());
	userModel.setName(userEntity.getName());
	userModel.setUsername(userEntity.getUsername());
	return userModel;
}
public static List<UserModel> getUserModelFromEntityList(List<UserEntity> userEntityList) {
	List<UserModel> list = new ArrayList<UserModel>();
	for (UserEntity userEntity2 : userEntityList) {
		list.add( getUserModelFromEntity(userEntity2));
	}	
	return list;
}



public static UserEntity getUserEntityFromUserModel(UserModel userModel) {
	UserEntity userEntity= new UserEntity();
	userEntity.setEmail(userModel.getEmail());
	userEntity.setName(userModel.getName());
	userEntity.setUsername(userModel.getUsername());
	return userEntity;
}

public static List<UserEntity> getUserEntityFromUserModelList(List<UserModel> userModelList) {
	List<UserEntity> list = new ArrayList<UserEntity>();
	for (UserModel usermodel : userModelList) {
		list.add( getUserEntityFromUserModel(usermodel));
	}	
	return list;
}


public static UserModel getUserModelFromView(UserModelView userModelView) {
	UserModel userModel= new UserModelImpl();
	userModel.setEmail(userModelView.getEmail());
	userModel.setName(userModelView.getName());
	userModel.setUsername(userModelView.getUsername());
	return userModel;
}

public static List<UserModel> getUserModelFromUserModelViewList(List<UserModelView> userModelViewList) {
	List<UserModel> list = new ArrayList<UserModel>();
	for (UserModelView usermodelView : userModelViewList) {
		list.add( getUserModelFromView(usermodelView));
	}	
	return list;
}


public static UserModelView getUserModelViewFromModel(UserModel userModel) {
	UserModelView userModelView= new UserModelView();
	userModelView.setEmail(userModel.getEmail());
	userModelView.setName(userModel.getName());
	userModelView.setUsername(userModel.getUsername());
	return userModelView;
}
public static List<UserModelView> getUserModelViewFromUserModelList(List<UserModel> userModelList) {
	List<UserModelView> list = new ArrayList<UserModelView>();
	for (UserModel usermodel : userModelList) {
		list.add( getUserModelViewFromModel(usermodel));
	}	
	return list;
}
}
