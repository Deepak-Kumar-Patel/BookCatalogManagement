package com.bookcatalog.domain;

import org.springframework.stereotype.Component;

@Component
public interface PublicationBookCatalogTypeModel {

	
	public Long getId() ;
	public void setId(Long id);
	public String getType();
	public void setType(String type);
	
}
