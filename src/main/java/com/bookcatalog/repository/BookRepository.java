package com.bookcatalog.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RestResource;

import com.bookcatalog.entity.BookEntity;

@RestResource(exported = false)
public interface BookRepository extends JpaRepository<BookEntity, Long> {

	@Query("SELECT b FROM BookEntity b WHERE b.authorEntity.authId = ?1 ")
	List<BookEntity>  findByAuthId(Long authId);
}
