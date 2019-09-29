package com.bookcatalog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.bookcatalog.entity.AuthorEntity;

@RestResource(exported = false)
public interface AuthorRepository extends JpaRepository<AuthorEntity, Long> {

}
