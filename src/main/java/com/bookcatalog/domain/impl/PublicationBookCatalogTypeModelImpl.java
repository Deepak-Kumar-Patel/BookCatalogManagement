package com.bookcatalog.domain.impl;

import org.springframework.stereotype.Component;

import com.bookcatalog.domain.PublicationBookCatalogTypeModel;
@Component
public class PublicationBookCatalogTypeModelImpl implements PublicationBookCatalogTypeModel {

	
	Long id;
	String type;
	
	
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
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	
	
	}
