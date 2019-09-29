package com.bookcatalog.model.view;

import java.util.Date;

public class CatalogDetailsReportView {
	private Long id;
	private AuthorModelView authorModelView;
	private PublicationModelView publicationModelView;
	private PublicationBookCatalogTypeModelView publicationBookCatalogTypeModelView;
	private String title;
	private Date year;
	private String genre;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public AuthorModelView getAuthorModelView() {
		return authorModelView;
	}
	public void setAuthorModelView(AuthorModelView authorModelView) {
		this.authorModelView = authorModelView;
	}
	public PublicationModelView getPublicationModelView() {
		return publicationModelView;
	}
	public void setPublicationModelView(PublicationModelView publicationModelView) {
		this.publicationModelView = publicationModelView;
	}
	public PublicationBookCatalogTypeModelView getPublicationBookCatalogTypeModelView() {
		return publicationBookCatalogTypeModelView;
	}
	public void setPublicationBookCatalogTypeModelView(
			PublicationBookCatalogTypeModelView publicationBookCatalogTypeModelView) {
		this.publicationBookCatalogTypeModelView = publicationBookCatalogTypeModelView;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getYear() {
		return year;
	}
	public void setYear(Date year) {
		this.year = year;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	//add COMIC properties
	
	
	//add Magazin Properties
	
	
	
}
