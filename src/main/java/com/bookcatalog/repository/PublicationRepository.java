package com.bookcatalog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookcatalog.entity.PublicationEntity;

@Repository
public interface PublicationRepository  extends JpaRepository<PublicationEntity, Long> {

}
