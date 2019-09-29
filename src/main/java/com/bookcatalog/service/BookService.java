package com.bookcatalog.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bookcatalog.domain.BookModel;

import javassist.tools.web.BadHttpRequest;

@Service
public interface BookService {

	public List<BookModel> findAll();
	public BookModel findOne(String bookName);
	public BookModel create(BookModel bookModel) ;
	public void delete(String bookName);
	public BookModel update(String bookName, BookModel bookModelFromView) throws BadHttpRequest;
	public BookModel findOne(Long bookId);
}
