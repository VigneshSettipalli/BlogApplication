package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

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
import com.example.demo.service.UserRepository;

@RestController
public class MainController {

	@Autowired
	UserDaoService userDaoService;

	@Autowired
	UserRepository userRepository;

	@GetMapping(path ="/users", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<User> getAllUsers(){
		return userRepository.findAll();
	}

	@GetMapping(path = "/users/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public User getUserById(@PathVariable int id) {		
		Optional<User> user = userRepository.findById(id);
		if(!user.isPresent())
			throw new RuntimeException("User with id "+id+" not found !");
		else
			return user.get();
	}

	@PostMapping(path = "/users", consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public User addUser(@RequestBody User user) {
		userRepository.save(user);
		return user;
	}

	@PutMapping(path = "/users/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE )
	public User updateUser(@PathVariable int id, @RequestBody User user)
	{
		Optional<User> oldUser = userRepository.findById(id);
		if(oldUser.isPresent()){
			User user1 = oldUser.get();
			user1.setAddress(user.getAddress());
			user1.setDOB(user.getDOB());
			user1.setEmail(user.getEmail());
			user1.setName(user.getName());
			userRepository.save(user1);
			return user1;
				}
		else 
			throw new RuntimeException("User with id "+id+" not found !");
	}

	@DeleteMapping(path= "/users/{id}",produces = MediaType.APPLICATION_JSON_VALUE )
	public Optional<User> deleteUser(@PathVariable int id)
	{
		Optional<User> user = userRepository.findById(id);
		if(user.isPresent())
		{
			userRepository.deleteById(id);
			return user;
		}
		else
			throw new RuntimeException("User with id "+id+" not found !");
	}


}
