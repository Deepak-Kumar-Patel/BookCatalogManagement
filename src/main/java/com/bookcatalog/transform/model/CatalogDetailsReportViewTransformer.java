package com.bookcatalog.transform.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.bookcatalog.domain.AuthorModel;
import com.bookcatalog.domain.BookModel;
import com.bookcatalog.domain.PublicationBookCatalogTypeModel;
import com.bookcatalog.domain.PublicationModel;
import com.bookcatalog.domain.impl.BookModelImpl;
import com.bookcatalog.entity.AuthorEntity;
import com.bookcatalog.entity.BookEntity;
import com.bookcatalog.entity.PublicationBookCatalogTypeEntity;
import com.bookcatalog.entity.PublicationEntity;
import com.bookcatalog.model.view.AuthorModelView;
import com.bookcatalog.model.view.BookModelView;
import com.bookcatalog.model.view.CatalogDetailsReportView;
import com.bookcatalog.model.view.PublicationBookCatalogTypeModelView;
import com.bookcatalog.model.view.PublicationModelView;


@Component
public class CatalogDetailsReportViewTransformer {

	 
	
	 
	 

	public  List<CatalogDetailsReportView> getBookModelViewFromBookModelLists(List<BookModel> bookModelList) {
		List<CatalogDetailsReportView> list = new ArrayList<CatalogDetailsReportView>();
		for (BookModel bookModel : bookModelList) {
			list.add(getCatalogDetailsReportViewFromModel(bookModel));
		}
		return list;
	} 

	 
 
	
	public  CatalogDetailsReportView getCatalogDetailsReportViewFromModel(BookModel model) {
		CatalogDetailsReportView catalogDetailsReportView = new CatalogDetailsReportView();
		BeanUtils.copyProperties(model, catalogDetailsReportView);

		PublicationBookCatalogTypeModel mod1 = model.getPublicationBookCatalogTypeModel();
		PublicationBookCatalogTypeModelView view1 = PublicationBookCatalogTypeTransformer.getPublicationBookCatalogTypeModelFRomView(mod1);
		catalogDetailsReportView.setPublicationBookCatalogTypeModelView(view1);

		PublicationModel pubModel = model.getPublicationModel();
		PublicationModelView publicationModelView = PublicationModelTransformer.getViewFromModel(pubModel);
		catalogDetailsReportView.setPublicationModelView(publicationModelView);

		AuthorModel authMode = model.getAuthorModel();
		AuthorModelView authView = AuthorModelTransformer.getViewFromModel(authMode);
		catalogDetailsReportView.setAuthorModelView(authView);
		
		return catalogDetailsReportView;
	}


	 
	
	  
	
}
