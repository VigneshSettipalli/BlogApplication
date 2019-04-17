package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserDaoService;

@RestController
public class MainController {
	
	@Autowired
	UserDaoService userDaoService;
	
	@GetMapping(path ="/users", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<User> getAllUsers(){
		return userDaoService.getAllUsers();
	}
	
	@GetMapping(path = "/users/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public User getUserById(@PathVariable int id) {		
		return userDaoService.getUserById(id);
	}
	
	@PostMapping(path = "/users", consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public User addUser(@RequestBody User user) {
		return userDaoService.addUser(user);
	}
	
	@PutMapping(path = "/users/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE )
	public User updateUser(@PathVariable int id, @RequestBody User user)
	{
		return userDaoService.updateUser(id, user);
	}
	
	@DeleteMapping(path= "/users/{id}",produces = MediaType.APPLICATION_JSON_VALUE )
	public User deleteUser(@PathVariable int id)
	{
		return userDaoService.deleteUser(id);
	}
	

}
