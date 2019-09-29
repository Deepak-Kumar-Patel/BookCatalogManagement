package com.bookcatalog.domain.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bookcatalog.dao.BookDao;
import com.bookcatalog.domain.AuthorModel;
import com.bookcatalog.domain.BookModel;
import com.bookcatalog.domain.PublicationBookCatalogTypeModel;
import com.bookcatalog.domain.PublicationModel;

import javassist.tools.web.BadHttpRequest;

@Component
public class BookModelImpl implements BookModel {

	
	@Autowired
	BookDao bookDao; 
	
	private Long id;
	private Long authorId;
	private Long publisherId;
	private Long publicTypeId;
	private String title;
	private Date year;
	private String genre;
	
	
	//void bookReview();	// Business Logic- review Comments()
	private String bookReview;
	private Date offerStartDate;
	private Date offerEndDate;
	private Double offerAmount; // Business Logic- getOfferAmountOnAuthorAndPublishedYear()
	
	private AuthorModel authorModel;
	private PublicationModel publicationModel;
	private PublicationBookCatalogTypeModel PublicationBookCatalogTypeModel;
	

	
	@Override
	public List<BookModel> findAll() {
		// TODO Auto-generated method stub
		return bookDao.findAll();
	}
	@Override
	public BookModel findOne(String bookName) {
		return bookDao.find(bookName)
		;
	}
	@Override
	public BookModel create(BookModel book) {
		return bookDao.create(book);
		 
	}
	@Override
	public void delete(String username) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public BookModel update(BookModel user) throws BadHttpRequest {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean isSeasonalOfferPresent() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public Double seasonalOffer() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public BookModel findOne(Long bookId) {
		return bookDao.find(bookId);
	}
	
	 
	
	
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the authorId
	 */
	public Long getAuthorId() {
		return authorId;
	}
	/**
	 * @param authorId the authorId to set
	 */
	public void setAuthorId(Long authorId) {
		this.authorId = authorId;
	}
	/**
	 * @return the publisherId
	 */
	public Long getPublisherId() {
		return publisherId;
	}
	/**
	 * @param publisherId the publisherId to set
	 */
	public void setPublisherId(Long publisherId) {
		this.publisherId = publisherId;
	}
	/**
	 * @return the publicTypeId
	 */
	public Long getPublicTypeId() {
		return publicTypeId;
	}
	/**
	 * @param publicTypeId the publicTypeId to set
	 */
	public void setPublicTypeId(Long publicTypeId) {
		this.publicTypeId = publicTypeId;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the year
	 */
	public Date getYear() {
		return year;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(Date year) {
		this.year = year;
	}
	/**
	 * @return the genre
	 */
	public String getGenre() {
		return genre;
	}
	/**
	 * @param genre the genre to set
	 */
	public void setGenre(String genre) {
		this.genre = genre;
	}
	/**
	 * @return the authorModel
	 */
	public AuthorModel getAuthorModel() {
		return authorModel;
	}
	/**
	 * @param authorModel the authorModel to set
	 */
	public void setAuthorModel(AuthorModel authorModel) {
		this.authorModel = authorModel;
	}
	/**
	 * @return the publicationModel
	 */
	public PublicationModel getPublicationModel() {
		return publicationModel;
	}
	/**
	 * @param publicationModel the publicationModel to set
	 */
	public void setPublicationModel(PublicationModel publicationModel) {
		this.publicationModel = publicationModel;
	}
	/**
	 * @return the publicationBookCatalogTypeModel
	 */
	public PublicationBookCatalogTypeModel getPublicationBookCatalogTypeModel() {
		return PublicationBookCatalogTypeModel;
	}
	/**
	 * @param publicationBookCatalogTypeModel the publicationBookCatalogTypeModel to set
	 */
	public void setPublicationBookCatalogTypeModel(PublicationBookCatalogTypeModel publicationBookCatalogTypeModel) {
		PublicationBookCatalogTypeModel = publicationBookCatalogTypeModel;
	}
	/**
	 * @return the bookDao
	 */
	public BookDao getBookDao() {
		return bookDao;
	}
	/**
	 * @param bookDao the bookDao to set
	 */
	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}	
	
}
