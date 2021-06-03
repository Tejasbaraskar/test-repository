package com.org.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.dao.AdminRepository;
import com.org.model.Admin;

@Service
public class AdminServiceImpl implements AdminService{

 

    @Autowired
    AdminRepository repository;
    
    @Override
    public Admin insertAdmin(Admin admin) {
        return repository.save(admin);
    }

 



	@Override
	public Admin fetchAdminByEmailIdAndPassword(String email, String password) {
	
		return repository.findByUsernameAndPassword(email, password);
	}

 

}