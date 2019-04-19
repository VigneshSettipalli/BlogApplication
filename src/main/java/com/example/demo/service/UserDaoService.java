package com.example.demo.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;


import com.example.demo.model.User;

/**
 * @author Vignesh
 * 
 */

//This class was used for array-list implementation of storing data with jdbc operations 

@Service
public class UserDaoService {
	
	
	/*
	 * private static List<User> userList = new ArrayList<>(); static {
	 * //userList.add(new User(1,"Vignesh",new Date(),"Chennai"));
	 * //userList.add(new User(2,"Prasad",new Date(),"Kolathur")); }
	 * 
	 * public List<User> getAllUsers(){ return userList; }
	 * 
	 * public User getUserById(int id) { return userList.stream().filter(c ->
	 * c.getId()==id).findFirst().get(); }
	 * 
	 * public User addUser(User user) { userList.add(user); return user; }
	 * 
	 * public User updateUser(int id, User user) { Optional<User> optUser =
	 * userList.stream().filter(c -> c.getId() == id).findFirst();
	 * if(optUser.isPresent()) userList.set(id, user); else throw new
	 * RuntimeException(); return user; }
	 * 
	 * public User deleteUser(int id) { Optional<User> optUser =
	 * userList.stream().filter(c -> c.getId() == id ).findFirst();
	 * if(optUser.isPresent()) userList.remove(optUser.get()); else throw new
	 * RuntimeException();
	 * 
	 * return optUser.get(); }
	 */
}
