package com.org.service;

import java.math.BigInteger;

import org.springframework.http.ResponseEntity;

import com.org.model.Users;

public interface UserService {

	public ResponseEntity<?> createUser(Users newUser);

	public Users updateUser(Users newUser);

	public String deleteUser(int UserId);

	public Iterable<Users> displayAllUser();

	public ResponseEntity<?> findUserById(int userId);

	//public Users usersLogin(Users users);

	public Users fetchUserByEmailIdAndPassword(String tempEmailId, String tempPassword);
}