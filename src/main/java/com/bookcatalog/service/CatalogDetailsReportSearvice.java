package com.bookcatalog.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bookcatalog.model.view.CatalogDetailsReportView;


@Service
public interface CatalogDetailsReportSearvice {

	List<CatalogDetailsReportView> search(CatalogDetailsReportView catalogDetailsReportView);
}
