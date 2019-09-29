package com.bookcatalog.transform.model;

import org.springframework.beans.BeanUtils;

import com.bookcatalog.domain.PublicationModel;
import com.bookcatalog.domain.impl.PublicationModelImpl;
import com.bookcatalog.entity.PublicationEntity;
import com.bookcatalog.model.view.PublicationModelView;

public class PublicationModelTransformer {
	
	
	public static PublicationModel getModelFromView(PublicationModelView view) {
		PublicationModel model = new PublicationModelImpl();
		BeanUtils.copyProperties(view, model);
		return model;
	}
	
	public static PublicationModelView getViewFromModel(PublicationModel model) {
		PublicationModelView view = new PublicationModelView();
		BeanUtils.copyProperties(model, view);
		return view;
	}
	
	public static PublicationModel getModelFromEntity(PublicationEntity entity) {
		PublicationModel view = new PublicationModelImpl();
		BeanUtils.copyProperties(entity, view);
		return view;
	}
	
	public static PublicationEntity getEntityFromModel(PublicationModel model) {
		PublicationEntity entity = new PublicationEntity();
		BeanUtils.copyProperties(model, entity);
		return entity;
	}

}
