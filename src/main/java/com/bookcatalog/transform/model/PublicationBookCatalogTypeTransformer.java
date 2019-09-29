package com.bookcatalog.transform.model;

import org.springframework.beans.BeanUtils;

import com.bookcatalog.domain.PublicationBookCatalogTypeModel;
import com.bookcatalog.domain.impl.PublicationBookCatalogTypeModelImpl;
import com.bookcatalog.entity.PublicationBookCatalogTypeEntity;
import com.bookcatalog.model.view.PublicationBookCatalogTypeModelView;

public class PublicationBookCatalogTypeTransformer {

	
	public static PublicationBookCatalogTypeModel getPublicationBookCatalogTypeModelFRomView(PublicationBookCatalogTypeModelView view) {		
		PublicationBookCatalogTypeModel model=new PublicationBookCatalogTypeModelImpl();
		BeanUtils.copyProperties(view, model);
		return model;
	}
	
	public static PublicationBookCatalogTypeModelView getPublicationBookCatalogTypeModelFRomView(PublicationBookCatalogTypeModel model) {		
		PublicationBookCatalogTypeModelView view=new PublicationBookCatalogTypeModelView();
		BeanUtils.copyProperties(model, view);
		return view;
	}
	
	public static PublicationBookCatalogTypeModel getEntiTyFromModel(PublicationBookCatalogTypeEntity entity) {		
		PublicationBookCatalogTypeModel model=new PublicationBookCatalogTypeModelImpl();
		BeanUtils.copyProperties(entity, model);
		return model;
	}
	
	public static PublicationBookCatalogTypeEntity getEntityFromModel(PublicationBookCatalogTypeModel model) {		
		PublicationBookCatalogTypeEntity entity=new PublicationBookCatalogTypeEntity();
		BeanUtils.copyProperties(model, entity);
		return entity;
	}
	
	
	
}
