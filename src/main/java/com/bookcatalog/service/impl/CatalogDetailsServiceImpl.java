package com.bookcatalog.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bookcatalog.dao.CatalogDetailsReportDao;
import com.bookcatalog.model.view.CatalogDetailsReportView;
import com.bookcatalog.service.CatalogDetailsReportSearvice;

@Component
public class CatalogDetailsServiceImpl implements  CatalogDetailsReportSearvice {

	@Autowired
	CatalogDetailsReportDao catalogDetailsReportDao;
	
	@Override
	public List<CatalogDetailsReportView> search(CatalogDetailsReportView catalogDetailsReportView) {
		 
		return catalogDetailsReportDao.search(catalogDetailsReportView);
	}

}
