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

import com.bookcatalog.entity.PublicationEntity;
import com.bookcatalog.repository.PublicationRepository;

import javassist.tools.web.BadHttpRequest;


@RestController
@RequestMapping(path = "/publication")
public class PublicationController {

	@Autowired
	private PublicationRepository publicRepository;

	@GetMapping
	public Iterable<PublicationEntity> findAll() {
		return publicRepository.findAll();
	}

	@GetMapping(path = "/{publicId}")
	public PublicationEntity find(@PathVariable("publicId") Long authorId) {
		return publicRepository.findOne(authorId);
	}

	@PostMapping(consumes = "application/json")
	public PublicationEntity create(@RequestBody PublicationEntity auth) {
		return publicRepository.save(auth);
	}

	@DeleteMapping(path = "/{publicId}")
	public void delete(@PathVariable("publicId") Long publicId) {
		publicRepository.delete(publicId);
	}

	@PutMapping(path = "/{publicId}")
	public PublicationEntity update(@PathVariable("publicId") Long publicId, @RequestBody PublicationEntity publica) throws BadHttpRequest {
		if (publicRepository.exists(publicId)) {
			PublicationEntity au = publicRepository.findOne(publicId);
			au.setPublicationName(publica.getPublicationName());
			return publicRepository.save(au);
		} else {
			throw new BadHttpRequest();
		}
	}

}