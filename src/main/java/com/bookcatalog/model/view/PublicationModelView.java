package com.bookcatalog.model.view;

import java.io.Serializable;

public class PublicationModelView implements Serializable {

	private static final long serialVersionUID = -844948748047551152L;
	private Long publicationId;
	private String publicationName;
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
