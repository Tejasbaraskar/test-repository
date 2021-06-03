package com.zensar.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zensar.model.Product;

public interface ProductRepo extends JpaRepository<Product, Long> {

}
