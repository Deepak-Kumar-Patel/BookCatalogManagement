package com.bookcatalog.domain;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import javassist.tools.web.BadHttpRequest;

@Component
public interface BookModel {

	public List<BookModel> findAll();
	public BookModel findOne(String username);
	public BookModel create(BookModel user);
	public void delete(String username);
	public BookModel update(BookModel user) throws BadHttpRequest;

	
	//Domain/Business Logic
	boolean isSeasonalOfferPresent();
	Double seasonalOffer();
   //Date getOfferStartDate();
   //Date getOfferEndDate();
   //Double getOfferAmountOnAuthorAndPublishedYear();
	//void bookReview();
   
	
	
	
	Long getAuthorId();

	AuthorModel getAuthorModel();

	String getGenre();

	Long getId();

	PublicationBookCatalogTypeModel getPublicationBookCatalogTypeModel();

	PublicationModel getPublicationModel();

	Long getPublicTypeId();

	Long getPublisherId();

	String getTitle();

	Date getYear();

	void setPublicationModel(PublicationModel publicationModel);

	void setPublicationBookCatalogTypeModel(PublicationBookCatalogTypeModel publicationBookCatalogTypeModel);

	void setAuthorModel(AuthorModel authorModel);

	public BookModel findOne(Long bookId);
}
