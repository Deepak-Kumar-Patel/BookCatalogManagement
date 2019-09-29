package com.bookcatalog.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bookcatalog.dao.BookDao;
import com.bookcatalog.dao.CatalogDetailsReportDao;
import com.bookcatalog.domain.BookModel;
import com.bookcatalog.entity.BookEntity;
import com.bookcatalog.model.view.CatalogDetailsReportView;
import com.bookcatalog.transform.model.BookTransformer;
import com.bookcatalog.transform.model.CatalogDetailsReportViewTransformer;

@Component
public class CatalogDetailsReportDaoImpl implements CatalogDetailsReportDao {

	@Autowired
	BookDao bookDao;
	
	@Autowired
	BookTransformer bookTransformer;
	
	@Autowired
	CatalogDetailsReportViewTransformer catalogDetailsReportViewTransformer;
	
	@Override
	public List<CatalogDetailsReportView> search(CatalogDetailsReportView catalogDetailsReportView) {
		
		List<CatalogDetailsReportView> list = new ArrayList<CatalogDetailsReportView>();
		Long authId = catalogDetailsReportView.getAuthorModelView().getAuthId();
		
		//For Book
		List<BookEntity>  bookEntityList = bookDao.findByAuthId(authId);
		List<BookModel> bmv = bookTransformer.getBookModelViewFromBookModelList(bookEntityList);
		List<CatalogDetailsReportView> c=catalogDetailsReportViewTransformer.getBookModelViewFromBookModelLists(bmv);
		list.addAll(c);
		
		//For Magazin
		
		//For COMICS
		
		
		return list;
	
	}

}
