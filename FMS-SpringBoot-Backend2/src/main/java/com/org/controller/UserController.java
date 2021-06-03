package com.org.controller;

import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.org.exceptions.RecordAlreadyPresentException;
import com.org.exceptions.RecordNotFoundException;
import com.org.model.Users;
import com.org.service.UserService;

@ComponentScan(basePackages = "com")
@RestController
@RequestMapping("/user")
public class UserController {

	/*
	 * @Autowired private RestTemplate restTemplate;
	 */
	
	
	@Autowired
	UserService userService;

	
	
	@PostMapping("/createUser")
	@ExceptionHandler(RecordAlreadyPresentException.class)
	public void addUser(@RequestBody Users users) {

		System.out.println("hi back");
		//restTemplate.exchange("http://localhost:8080/lo", HttpMethod.GET,null, Users.class);
		
		  System.out.println(users.getUserFullName());
		   userService.createUser(users);
	}
	
//	@PostMapping("/login")
//	public Users usersLogin(@RequestBody Users users) {
//		
//		  System.out.println(users.getUserName());
//
//		return userService.usersLogin(users);
//	}
	
	
	@PostMapping(value = "/login")
	public Users loginUser(@RequestBody Users users)
			throws Exception {
	//	model.addAttribute("email",email);
		String tempEmailId = users.getUserName();
		String tempPassword = users.getUserPassword();
		Users userObj = null;
		if (tempEmailId != null && tempPassword != null) {
			userObj = userService.fetchUserByEmailIdAndPassword(tempEmailId, tempPassword);
		}
		if (userObj == null)
		 return userObj;
		return userObj;
	}
	
	

	@GetMapping("/readAllUsers")
	public Iterable<Users> readAllUsers() {

		return userService.displayAllUser();
	}

	@PutMapping("/updateUser")
	@ExceptionHandler(RecordNotFoundException.class)
	public void updateUser(@RequestBody Users updateUser) {

		userService.updateUser(updateUser);
	}

	@GetMapping("/searchUser/{id}")
	@ExceptionHandler(RecordNotFoundException.class)
	public ResponseEntity<?> searchUserByID(@PathVariable("id") int userId) {

		return userService.findUserById(userId);
	}

	@DeleteMapping("/deleteUser/{id}")
	@ExceptionHandler(RecordNotFoundException.class)
	public void deleteBookingByID(@PathVariable("id") int userId) {

		userService.deleteUser(userId);
	}
}