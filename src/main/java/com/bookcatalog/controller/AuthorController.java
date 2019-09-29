package com.bookcatalog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookcatalog.entity.AuthorEntity;
import com.bookcatalog.repository.AuthorRepository;

import javassist.tools.web.BadHttpRequest;


@RestController
@RequestMapping(path = "/author")
public class AuthorController {

	@Autowired
	private AuthorRepository authRepository;

	@GetMapping
	public Iterable<AuthorEntity> findAll() {
		return authRepository.findAll();
	}

	@GetMapping(path = "/{authorId}")
	public AuthorEntity find(@PathVariable("authorId") Long authorId) {
		return authRepository.findOne(authorId);
	}

	@PostMapping(consumes = "application/json")
	public AuthorEntity create(@RequestBody AuthorEntity auth) {
		return authRepository.save(auth);
	}

	@DeleteMapping(path = "/{authorId}")
	public void delete(@PathVariable("authorId") Long authorId) {
		authRepository.delete(authorId);
	}

	@PutMapping(path = "/{authorId}")
	public AuthorEntity update(@PathVariable("authorId") Long authorId, @RequestBody AuthorEntity author) throws BadHttpRequest {
		if (authRepository.exists(authorId)) {
			AuthorEntity au = authRepository.findOne(authorId);
			au.setName(author.getName());
			au.setEmail(author.getEmail());
			return authRepository.save(au);
		} else {
			throw new BadHttpRequest();
		}
	}

}