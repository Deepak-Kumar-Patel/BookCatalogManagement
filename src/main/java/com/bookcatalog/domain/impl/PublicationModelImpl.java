package com.bookcatalog.domain.impl;

import org.springframework.stereotype.Component;

import com.bookcatalog.domain.PublicationModel;
@Component
public class PublicationModelImpl implements PublicationModel {

	private Long publicationId;
	private String publicationName;
	private String publicationRegdId;
	/**
	 * @return the publicationId
	 */
	public Long getPublicationId() {
		return publicationId;
	}
	/**
	 * @param publicationId the publicationId to set
	 */
	public void setPublicationId(Long publicationId) {
		this.publicationId = publicationId;
	}
	/**
	 * @return the publicationName
	 */
	public String getPublicationName() {
		return publicationName;
	}
	/**
	 * @param publicationName the publicationName to set
	 */
	public void setPublicationName(String publicationName) {
		this.publicationName = publicationName;
	}
	/**
	 * @return the publicationRegdId
	 */
	public String getPublicationRegdId() {
		return publicationRegdId;
	}
	/**
	 * @param publicationRegdId the publicationRegdId to set
	 */
	public void setPublicationRegdId(String publicationRegdId) {
		this.publicationRegdId = publicationRegdId;
	}

	
}
