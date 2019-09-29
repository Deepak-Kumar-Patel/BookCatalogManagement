package com.bookcatalog.transform.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
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
import com.bookcatalog.model.view.PublicationBookCatalogTypeModelView;
import com.bookcatalog.model.view.PublicationModelView;


@Component
public class BookTransformer {

	@Autowired
	BookModel bookModel;
	
	
	public  List<BookModel> getBookModelViewFromBookModelList(List<BookEntity> list) {
		
		List<BookModel> bookModelList = new ArrayList<BookModel>();
		for (BookEntity bookEntity : list) {
			bookModelList.add(getBookModelViewFromBookEntitty(bookEntity));
		}
		return bookModelList;
	}

	public  List<BookModelView> getBookModelViewFromBookModelLists(List<BookModel> bookModelList) {
		List<BookModelView> list = new ArrayList<BookModelView>();
		for (BookModel bookModel : bookModelList) {
			list.add(getBookModelViewFromModel(bookModel));
		}
		return list;
	}

	public  BookModel getBookModelViewFromBookEntitiy(BookEntity bookEntity) {
		return getBookModelViewFromBookEntitty(bookEntity);
	}

	public BookModel getBookModelFromView(BookModelView bookModelView) {
		return getBookModelViewFromModel(bookModelView);
	}

	public  BookEntity getBookEntityFromBookModel(BookModel book) {
		return 	getBookEntityFromModel(book);
	}
	
	public  BookModelView getBookModelViewFromModel(BookModel model) {
		BookModelView bookView = new BookModelView();
		BeanUtils.copyProperties(model, bookView);

		PublicationBookCatalogTypeModel mod1 = model.getPublicationBookCatalogTypeModel();
		PublicationBookCatalogTypeModelView view1 = PublicationBookCatalogTypeTransformer.getPublicationBookCatalogTypeModelFRomView(mod1);
		bookView.setPublicationBookCatalogTypeModelView(view1);

		PublicationModel pubModel = model.getPublicationModel();
		PublicationModelView publicationModelView = PublicationModelTransformer.getViewFromModel(pubModel);
		bookView.setPublicationModelView(publicationModelView);

		AuthorModel authMode = model.getAuthorModel();
		AuthorModelView authView = AuthorModelTransformer.getViewFromModel(authMode);
		bookView.setAuthorModelView(authView);
		
		return bookView;
	}


	public BookModel getBookModelViewFromModel(BookModelView view) {
		//BookModel bookModel = new BookModelImpl();
		BeanUtils.copyProperties(view,bookModel);

		PublicationBookCatalogTypeModelView pubCatview = view.getPublicationBookCatalogTypeModelView();
		PublicationBookCatalogTypeModel pubCatModel = PublicationBookCatalogTypeTransformer.getPublicationBookCatalogTypeModelFRomView(pubCatview);
		bookModel.setPublicationBookCatalogTypeModel(pubCatModel);

		PublicationModelView pubView = view.getPublicationModelView();
		PublicationModel publicationModel = PublicationModelTransformer.getModelFromView(pubView);
		bookModel.setPublicationModel(publicationModel); 

		AuthorModelView authView = view.getAuthorModelView();
		AuthorModel authModel = AuthorModelTransformer.getModelFromView(authView);
		bookModel.setAuthorModel(authModel);
		
		return bookModel;
	}
	
	
	public static BookEntity getBookEntityFromModel(BookModel model) {
		BookEntity bookEntity = new BookEntity();
		BeanUtils.copyProperties(model, bookEntity);

		PublicationBookCatalogTypeModel mod1 = model.getPublicationBookCatalogTypeModel();
		PublicationBookCatalogTypeEntity pubCatentity = PublicationBookCatalogTypeTransformer.getEntityFromModel(mod1);
		bookEntity.setPublicationBookTypeEntity(pubCatentity);

		PublicationModel pubModel = model.getPublicationModel();
		PublicationEntity pubEntity = PublicationModelTransformer.getEntityFromModel(pubModel);
		bookEntity.setPublicTypeEntity(pubEntity);

		AuthorModel authMode = model.getAuthorModel();
		AuthorEntity authorEntity = AuthorModelTransformer.getEntyFromModel(authMode);
		bookEntity.setAuthorEntity(authorEntity);

		return bookEntity;
	}
	
	
	public static BookModel getBookModelViewFromBookEntitty(BookEntity bookEntity) {
		BookModel model = new BookModelImpl();
		BeanUtils.copyProperties(bookEntity, model);

		PublicationBookCatalogTypeEntity entity = bookEntity.getPublicationBookTypeEntity();
		PublicationBookCatalogTypeModel mod = PublicationBookCatalogTypeTransformer.getEntiTyFromModel(entity);
		model.setPublicationBookCatalogTypeModel(mod);
		
		PublicationEntity pubEntity = bookEntity.getPublicTypeEntity();
		PublicationModel pubModel = PublicationModelTransformer.getModelFromEntity(pubEntity);
		model.setPublicationModel(pubModel);
		
		AuthorEntity authorEntity = bookEntity.getAuthorEntity();
		AuthorModel authorModel = AuthorModelTransformer.getModelFromView(authorEntity);
		model.setAuthorModel(authorModel);
		
		return model;
	}
	
}
