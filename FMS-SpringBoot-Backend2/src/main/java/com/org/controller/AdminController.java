package com.org.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.model.Admin;
import com.org.service.AdminService;

@ComponentScan(basePackages = "com")
@RestController
@RequestMapping("/admin")
public class AdminController {
    
    @Autowired
    AdminService service;
    
    @PostMapping(value = "/adminAdded")
    public Admin insertAdmin(@RequestBody Admin admin) {
        return service.insertAdmin(admin);
    }
    
    @PostMapping(value = "/adminProfile")
	public Admin loginAdmin(@RequestBody Admin admin)
			throws Exception {
	//	model.addAttribute("email",email);
    	
    	System.out.println("loginAdmin");
    	
		String tempEmailId = admin.getUsername();
		String tempPassword = admin.getPassword();
		Admin userObj = null;
		if (tempEmailId != null && tempPassword != null) {
			userObj = service.fetchAdminByEmailIdAndPassword(tempEmailId, tempPassword);
		}
		if (userObj == null)
		 return userObj;
		return userObj;
	}
}
