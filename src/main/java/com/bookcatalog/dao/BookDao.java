package com.bookcatalog.dao;

import java.util.List;

import com.bookcatalog.domain.BookModel;
import com.bookcatalog.entity.BookEntity;

import javassist.tools.web.BadHttpRequest;

public interface BookDao {

	 List<BookModel> findAll();
	 BookModel find(String bookName);
	 BookModel create(BookModel book) ;
	 void delete(String bookName);
	 BookModel update(BookModel user) throws BadHttpRequest;
	 BookModel find(Long bookId);
	 void delete(Long id);
	 
	 List<BookEntity> findByAuthId(Long authId);
}
