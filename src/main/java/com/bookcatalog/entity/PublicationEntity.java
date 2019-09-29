package com.bookcatalog.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "publication")
public class PublicationEntity implements Serializable {

	/*DROP TABLE IF EXISTS `book_catalog`.`publication`;
CREATE TABLE  `book_catalog`.`publication` (
  `publication_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `publication_name` varchar(45) NOT NULL,
  `publication_regd_id` varchar(45) NOT NULL,
  PRIMARY KEY (`publication_id`),
  UNIQUE KEY `unique_publisher_regd_id` (`publication_regd_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;;*/
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -9035009958087660892L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "publication_id")
	private Long publicationId;
	
	@Column(name = "publication_name")
	private String publicationName;
	
	@Column(name = "publication_regd_id")
	private String publicationRegdId;

	 

	public Long getPublicationId() {
		return publicationId;
	}

	public void setPublicationId(Long publicationId) {
		this.publicationId = publicationId;
	}

	public String getPublicationName() {
		return publicationName;
	}

	public void setPublicationName(String publicationName) {
		this.publicationName = publicationName;
	}

	public String getPublicationRegdId() {
		return publicationRegdId;
	}

	public void setPublicationRegdId(String publicationRegdId) {
		this.publicationRegdId = publicationRegdId;
	}

	
	 

	
}
