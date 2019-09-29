package com.bookcatalog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.bookcatalog.entity.UserEntity;

@RestResource(exported = false)
public interface UserRepository extends JpaRepository<UserEntity, String> {

}
