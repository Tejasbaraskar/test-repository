package com.zensar.SecureApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zensar.SecureApp.models.Secureuser;

public interface UserRepository extends JpaRepository<Secureuser, Integer> {

	Secureuser findByUsername(String username);
}
