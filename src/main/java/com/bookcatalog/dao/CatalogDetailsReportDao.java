package com.bookcatalog.dao;

import java.util.List;

import com.bookcatalog.model.view.CatalogDetailsReportView;

public interface CatalogDetailsReportDao {

	List<CatalogDetailsReportView> search(CatalogDetailsReportView catalogDetailsReportView);
}
