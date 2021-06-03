package com.zensar.springbootrestfulwebservice.repository;


import org.springframework.data.repository.CrudRepository;

import com.zensar.springbootrestfulwebservice.beans.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

	

}