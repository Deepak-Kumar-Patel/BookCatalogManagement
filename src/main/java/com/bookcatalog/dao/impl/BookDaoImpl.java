package com.bookcatalog.dao.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bookcatalog.dao.BookDao;
import com.bookcatalog.domain.BookModel;
import com.bookcatalog.entity.BookEntity;
import com.bookcatalog.repository.AuthorRepository;
import com.bookcatalog.repository.BookRepository;
import com.bookcatalog.repository.PublicationBookCatalogTypeRepository;
import com.bookcatalog.repository.PublicationRepository;
import com.bookcatalog.transform.model.BookTransformer;

import javassist.tools.web.BadHttpRequest;

@Component
public class BookDaoImpl implements BookDao {

	@Autowired
	private BookRepository repository;
	
	@Autowired
	AuthorRepository authorRepository;
	
	@Autowired
	PublicationBookCatalogTypeRepository publicationBookCatalogTypeRepository;
	
	@Autowired
	PublicationRepository publicationRepository;
	
	@Autowired
	BookTransformer bookTransformer;

	@Override
	public List<BookModel> findAll() {
		return bookTransformer.getBookModelViewFromBookModelList(repository.findAll());
	}

	@Override
	public BookModel find(Long bookId) {
		return bookTransformer.getBookModelViewFromBookEntitiy(repository.findOne(bookId));
	}

	@Override
	public BookModel create(BookModel bookModel) {
		//BookEntity be = BookTransformer.getBookEntityFromBookModel(book);
		
		BookEntity bookEntity = new BookEntity();
		BeanUtils.copyProperties(bookModel, bookEntity);

		 bookEntity.setPublicationBookTypeEntity(publicationBookCatalogTypeRepository.getOne(bookModel.getPublicationBookCatalogTypeModel().getId()));

		 bookEntity.setPublicTypeEntity(publicationRepository.getOne(bookModel.getPublicationBookCatalogTypeModel().getId()));

		bookEntity.setAuthorEntity(authorRepository.findOne(bookModel.getAuthorModel().getAuthId()));
		
		
		
		BookEntity bookEntityRet = repository.save(bookEntity);
		return bookTransformer.getBookModelViewFromBookEntitiy(bookEntityRet);
	}

	@Override
	public void delete(Long id) {
		repository.delete(id);
	}

	@Override
	public BookModel update(BookModel book) throws BadHttpRequest {

		BookEntity be = bookTransformer.getBookEntityFromBookModel(book);
		BookEntity bookEntity = repository.save(be);
		return bookTransformer.getBookModelViewFromBookEntitiy(bookEntity);
	}

	@Override
	public BookModel find(String bookName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(String bookName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<BookEntity>  findByAuthId(Long authId) {
		return repository.findByAuthId(authId);
		 
	}
	
	
	
	
	
	
	
}
