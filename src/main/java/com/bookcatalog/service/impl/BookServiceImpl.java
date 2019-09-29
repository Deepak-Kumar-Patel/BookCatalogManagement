package com.bookcatalog.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bookcatalog.domain.BookModel;
import com.bookcatalog.service.BookService;

import javassist.tools.web.BadHttpRequest;

@Component
public class BookServiceImpl implements BookService {

	@Autowired
	BookModel bookModel;

	@Override
	public List<BookModel> findAll() {
		// TODO Auto-generated method stub
		return bookModel.findAll();
	}

	@Override
	public BookModel findOne(String bookName) {
		return bookModel.findOne(bookName);
	}

	@Override
	public BookModel create(BookModel bookModel) {
		return bookModel.create(bookModel);
	}

	@Override
	public void delete(String bookName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BookModel update(String bookName, BookModel bookModelFromView) throws BadHttpRequest {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookModel findOne(Long bookId) {
		return bookModel.findOne(bookId);
	}
	
	
	
}
