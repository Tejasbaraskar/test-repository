package com.org.service;

import org.springframework.http.ResponseEntity;

import com.org.model.Admin;




public interface AdminService {

	public Admin insertAdmin(Admin admin);
	public Admin fetchAdminByEmailIdAndPassword(String tempEmailId, String tempPassword);

}
