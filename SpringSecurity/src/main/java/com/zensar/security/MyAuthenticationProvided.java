package com.zensar.security;

import java.util.Arrays;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;

public class MyAuthenticationProvided implements AuthenticationProvider {

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		String userName =authentication.getName();
		String password =authentication.getCredentials().toString();
		if("tejas".equals(userName) && "1234".equals(password)) {
			return new UsernamePasswordAuthenticationToken(userName, password,Arrays.asList());
		}
		else {
		 throw new BadCredentialsException("invalid userName or passwprd");
		}
	}
	

	@Override
	public boolean supports(Class<?> authentication) {
		// TODO Auto-generated method stub
		return authentication.equals(UsernamePasswordAuthenticationToken.class);
	}

}
