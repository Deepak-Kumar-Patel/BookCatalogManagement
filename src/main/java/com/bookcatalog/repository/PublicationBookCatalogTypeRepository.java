package com.bookcatalog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookcatalog.entity.PublicationBookCatalogTypeEntity;

@Repository
public interface PublicationBookCatalogTypeRepository extends JpaRepository<PublicationBookCatalogTypeEntity, Long> {

}
