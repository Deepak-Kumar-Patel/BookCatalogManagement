package com.bookcatalog.domain;

import org.springframework.stereotype.Component;

@Component
public interface PublicationModel {

 
			public Long getPublicationId();
			public void setPublicationId(Long publicationId);
			public String getPublicationName();
			public void setPublicationName(String publicationName);
			public String getPublicationRegdId();
			public void setPublicationRegdId(String publicationRegdId);
}
