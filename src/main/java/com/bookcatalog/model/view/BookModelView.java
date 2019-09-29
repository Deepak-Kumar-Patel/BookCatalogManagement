package com.bookcatalog.model.view;

import java.io.Serializable;
import java.util.Date;



public class BookModelView implements Serializable {
	
	private static final long serialVersionUID = 6183566848142191725L;
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

	@Override
	public String toString() {
		return super.toString();
	}
	
	/**
	 * @return the authorModelView
	 */
	public AuthorModelView getAuthorModelView() {
		return authorModelView;
	}

	/**
	 * @param authorModelView the authorModelView to set
	 */
	public void setAuthorModelView(AuthorModelView authorModelView) {
		this.authorModelView = authorModelView;
	}

	/**
	 * @return the publicationModelView
	 */
	public PublicationModelView getPublicationModelView() {
		return publicationModelView;
	}

	/**
	 * @param publicationModelView the publicationModelView to set
	 */
	public void setPublicationModelView(PublicationModelView publicationModelView) {
		this.publicationModelView = publicationModelView;
	}

	/**
	 * @return the publicationBookCatalogTypeModelView
	 */
	public PublicationBookCatalogTypeModelView getPublicationBookCatalogTypeModelView() {
		return publicationBookCatalogTypeModelView;
	}

	/**
	 * @param publicationBookCatalogTypeModelView the publicationBookCatalogTypeModelView to set
	 */
	public void setPublicationBookCatalogTypeModelView(
			PublicationBookCatalogTypeModelView publicationBookCatalogTypeModelView) {
		this.publicationBookCatalogTypeModelView = publicationBookCatalogTypeModelView;
	}
	
	
	
	
}
