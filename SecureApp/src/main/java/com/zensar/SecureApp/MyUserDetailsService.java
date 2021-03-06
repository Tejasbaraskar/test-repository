package com.zensar.SecureApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.zensar.SecureApp.models.Secureuser;
import com.zensar.SecureApp.repository.UserRepository;

@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository repo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		Secureuser secureuser = repo.findByUsername(username);
		
		if(secureuser==null)
			throw new UsernameNotFoundException("User Not Found 404");
		
		
		return new UserPrincipal(secureuser);
	}

}
