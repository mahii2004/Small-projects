package com.mahi.springboot.controller;
import com.mahi.springboot.exception.UserNotFoundException;
import com.mahi.springboot.model.user;
import  com.mahi.springboot.repository.userRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:3000")
public class userController {

	@Autowired
    private userRepository userRepository;
	
	
	@PostMapping("/user")
	public user newUser(@RequestBody user newUser) {
		return userRepository.save(newUser);
	}
	
	@GetMapping("/users")
	public List<user> getAllUsers(){
		return userRepository.findAll();
	}
	
	@GetMapping("/users/{id}")
	public user getUserById(@PathVariable Long id) {
		return userRepository.findById(id)
				.orElseThrow(()-> new UserNotFoundException(id));
	}
	
	@PutMapping("/user/{id}")
	public user UpdateUser(@RequestBody user newUser, @PathVariable Long id ) {
		return  userRepository.findById(id)
				.map(user ->{
					user.setName(newUser.getName());
					user.setEmail(newUser.getEmail());
					user.setUserName(newUser.getUserName());
					return userRepository.save(user);
				}).orElseThrow(()-> new UserNotFoundException(id));
	}
	
	
	@DeleteMapping("/user/{id}")
	public String deleteUser(@PathVariable Long id) {
		if(!userRepository.existsById(id)) {
			throw new UserNotFoundException(id);
		}
		userRepository.deleteById(id);
		return "user with id " + id + " has been deleted succes";
	}
	
}
	
