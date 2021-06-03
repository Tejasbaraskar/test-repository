package com.zensar.springbootrestfulwebservice.repository;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.zensar.springbootrestfulwebservice.beans.Product;

//public interface ProductRepository extends CrudRepository<Product, Integer> {

public interface ProductRepository extends PagingAndSortingRepository<Product, Integer> {

 // List<Product>	 queryByProductNameOrProductCost(String productName,int productCost);

//	@Query("FROM Product p where p.productName=?1")
//	List<Product> productByItsName(String productName);
	
	
//	@Query("FROM Product p where p.productCost=?1")
//	List<Product> productByItsCost(int productCost);
	
	@Query(value = "select * from product where name=:name",nativeQuery = true)
	List<Product> productByItsName(@Param("name")String productName);
	
	@Query(value = "select * from product where cost=:cost",nativeQuery = true)
	List<Product> productByItsCost(@Param("cost")int productCost);
	
	
}