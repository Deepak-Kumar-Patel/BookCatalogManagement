package com.bookcatalog.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "book")
public class BookEntity implements Serializable {
	/*DROP TABLE IF EXISTS `book_catalog`.`book`;
CREATE TABLE  `book_catalog`.`book` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `author_id` int(10) unsigned NOT NULL,
  `publication_id` int(10) unsigned NOT NULL,
  `public_type_id` int(10) unsigned NOT NULL,
  `title` varchar(45) DEFAULT NULL,
  `year` date DEFAULT NULL,
  `genre` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_author_id` (`author_id`),
  KEY `FK_Publication_id` (`publication_id`),
  KEY `FK_public_type_id` (`public_type_id`),
  CONSTRAINT `FK_author_id` FOREIGN KEY (`author_id`) REFERENCES `author` (`authId`),
  CONSTRAINT `FK_Publication_id` FOREIGN KEY (`publication_id`) REFERENCES `publication` (`publication_id`),
  CONSTRAINT `FK_public_type_id` FOREIGN KEY (`public_type_id`) REFERENCES `publication_type` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;*/
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1937986287602655225L;


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "author_id", referencedColumnName = "auth_id")
	private  AuthorEntity authorEntity;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "publication_id", referencedColumnName = "publication_id")
	private  PublicationEntity publicTypeEntity;
	
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "public_type_id", referencedColumnName = "id")
	private  PublicationBookCatalogTypeEntity publicationBookTypeEntity;
	
	private  String title;
	
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

	/**
	 * @return the authorEntity
	 */
	public AuthorEntity getAuthorEntity() {
		return authorEntity;
	}

	/**
	 * @param authorEntity the authorEntity to set
	 */
	public void setAuthorEntity(AuthorEntity authorEntity) {
		this.authorEntity = authorEntity;
	}

	/**
	 * @return the publicTypeEntity
	 */
	public PublicationEntity getPublicTypeEntity() {
		return publicTypeEntity;
	}

	/**
	 * @param publicTypeEntity the publicTypeEntity to set
	 */
	public void setPublicTypeEntity(PublicationEntity publicTypeEntity) {
		this.publicTypeEntity = publicTypeEntity;
	}

	/**
	 * @return the publicationBookTypeEntity
	 */
	public PublicationBookCatalogTypeEntity getPublicationBookTypeEntity() {
		return publicationBookTypeEntity;
	}

	/**
	 * @param publicationBookTypeEntity the publicationBookTypeEntity to set
	 */
	public void setPublicationBookTypeEntity(PublicationBookCatalogTypeEntity publicationBookTypeEntity) {
		this.publicationBookTypeEntity = publicationBookTypeEntity;
	}
	
	
	
	
}
