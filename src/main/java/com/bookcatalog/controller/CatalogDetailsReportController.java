package com.bookcatalog.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookcatalog.model.view.BookModelView;
import com.bookcatalog.model.view.CatalogDetailsReportView;
import com.bookcatalog.service.BookService;
import com.bookcatalog.service.CatalogDetailsReportSearvice;
import com.bookcatalog.transform.model.CatalogDetailsReportViewTransformer;

@RestController
@RequestMapping(path = "/catalogs")
public class CatalogDetailsReportController {

	@Autowired
	private CatalogDetailsReportSearvice catalogDetailsReportSearvice;
	
	@Autowired
	private BookService bookService;
	
	@Autowired
	CatalogDetailsReportViewTransformer catalogDetailsReportViewTransformer;

	@GetMapping
	public List<CatalogDetailsReportView> findAll() {
		List<CatalogDetailsReportView> list = new ArrayList<CatalogDetailsReportView>();
		
		//For BOOK
		list = catalogDetailsReportViewTransformer.getBookModelViewFromBookModelLists(bookService.findAll());
		
		//For MAGAZIN
		//convert and  add in list
		
		//For COMIC
		//convert and add in list
		
		return list;
	}
 
	@PostMapping(path="/search", consumes = "application/json")
	public List<CatalogDetailsReportView> search(@RequestBody CatalogDetailsReportView catalogDetailsReportView) {
		return  catalogDetailsReportSearvice.search(catalogDetailsReportView);
	
	}

 

}