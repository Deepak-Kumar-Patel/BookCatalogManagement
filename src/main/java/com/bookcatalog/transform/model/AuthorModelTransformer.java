package com.bookcatalog.transform.model;

import org.springframework.beans.BeanUtils;

import com.bookcatalog.domain.AuthorModel;
import com.bookcatalog.domain.impl.AuthorModelImpl;
import com.bookcatalog.entity.AuthorEntity;
import com.bookcatalog.model.view.AuthorModelView;

public class AuthorModelTransformer {

	
	public static AuthorModel getModelFromView(AuthorModelView view) {
		AuthorModel model = new AuthorModelImpl();
		BeanUtils.copyProperties(view, model);
		return model;
	}
	
	public static AuthorModelView getViewFromModel(AuthorModel model) {
		AuthorModelView view = new AuthorModelView();
		BeanUtils.copyProperties(model, view);
		return view;
	}
	
	public static AuthorEntity getEntyFromModel(AuthorModel model) {
		AuthorEntity entity = new AuthorEntity();
		BeanUtils.copyProperties(model, entity);
		return entity;
	}
	public static AuthorModel getModelFromView(AuthorEntity entity) {
		AuthorModel model = new AuthorModelImpl();
		BeanUtils.copyProperties(entity, model);
		return model;
	}
	
}
