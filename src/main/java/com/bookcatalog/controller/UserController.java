package com.bookcatalog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookcatalog.domain.UserModel;
import com.bookcatalog.model.view.UserModelView;
import com.bookcatalog.service.UserService;
import com.bookcatalog.transform.model.UserTransformer;

import javassist.tools.web.BadHttpRequest;

@RestController
@RequestMapping(path = "/users")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping
	public List<UserModelView> findAll() {
		return UserTransformer.getUserModelViewFromUserModelList(userService.findAll());
	}

	@GetMapping(path = "/{username}")
	public UserModelView find(@PathVariable("username") String username) {
		return UserTransformer.getUserModelViewFromModel(userService.findOne(username));
	}

	@PostMapping(consumes = "application/json")
	public UserModelView create(@RequestBody UserModelView userModelView) {
		
		UserModel um = UserTransformer.getUserModelFromView(userModelView);
		um = userService.create(um);
		return UserTransformer.getUserModelViewFromModel(um);
	}

	@DeleteMapping(path = "/{username}")
	public void delete(@PathVariable("username") String username) {
		userService.delete(username);
	}

	@PutMapping(path = "/{username}")
	public UserModelView update(@PathVariable("username") String username, @RequestBody UserModelView user) throws BadHttpRequest {
		
		UserModel um = userService.update(username, UserTransformer.getUserModelFromView(user));
		return UserTransformer.getUserModelViewFromModel(um);
	}

}