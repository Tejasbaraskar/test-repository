package com.zensar.SecureApp;

import java.util.Collection;
import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.zensar.SecureApp.models.Secureuser;

public class UserPrincipal implements UserDetails {

	@Autowired
	private Secureuser secureuser;
	
	
	
	public UserPrincipal(Secureuser secureuser) {
		super();
		this.secureuser = secureuser;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {

		 
		return Collections.singleton(new SimpleGrantedAuthority("USER"));
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return secureuser.getPassword();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return secureuser.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true ;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
