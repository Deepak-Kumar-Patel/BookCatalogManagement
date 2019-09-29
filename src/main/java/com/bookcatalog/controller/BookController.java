package com.bookcatalog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookcatalog.domain.BookModel;
import com.bookcatalog.model.view.BookModelView;
import com.bookcatalog.service.BookService;
import com.bookcatalog.transform.model.BookTransformer;

import javassist.tools.web.BadHttpRequest;

@RestController
@RequestMapping(path = "/books")
public class BookController {

	@Autowired
	private BookService bookService;
	
	@Autowired
	BookTransformer bookTransformer;

	@GetMapping
	public List<BookModelView> findAll() {
		return bookTransformer.getBookModelViewFromBookModelLists(bookService.findAll());
	}

	@GetMapping(path = "/{bookId}")
	public BookModelView find(@PathVariable("bookId") Long bookId) {
		return bookTransformer.getBookModelViewFromModel(bookService.findOne(bookId));
	}

	@PostMapping(consumes = "application/json")
	public BookModelView create(@RequestBody BookModelView bookModelView) {
		
		BookModel bm = bookTransformer.getBookModelFromView(bookModelView);
		bm = bookService.create(bm);
		return bookTransformer.getBookModelViewFromModel(bm);
	}

	@DeleteMapping(path = "/{bookName}")
	public void delete(@PathVariable("bookName") String bookName) {
		bookService.delete(bookName);
	}

	@PutMapping(path = "/{bookName}")
	public BookModelView update(@PathVariable("bookName") String bookName, @RequestBody BookModelView book) throws BadHttpRequest {
		
		BookModel bm = bookService.update(bookName, bookTransformer.getBookModelFromView(book));
		return bookTransformer.getBookModelViewFromModel(bm);
	}

}