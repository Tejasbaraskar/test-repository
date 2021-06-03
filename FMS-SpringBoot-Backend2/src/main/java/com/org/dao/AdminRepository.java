package com.org.dao;

import org.springframework.data.repository.CrudRepository;

import com.org.model.Admin;




public interface AdminRepository extends CrudRepository<Admin, Integer>{

	Admin findByUsernameAndPassword(String email, String password);
}
