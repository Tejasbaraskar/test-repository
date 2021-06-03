package com.zensar.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.zensar.beans.Product;

@Repository
public class ProductRepositoryImpl implements ProductRepository{

	@Autowired
	private JdbcTemplate template;
	
	List<Product> products;

	public ProductRepositoryImpl() {
		products=new ArrayList<Product>();
	}
	
	@Override
	public int submitProduct(Product product) {
//		products.add(product);
//		System.out.println(products);
		
		return template.update("insert into product values("+product.getProductId()+",'"+product.getProductName()+"',"+product.getProductCost()+");");
	}

	@Override
	public List<Product> getAllProducts() {
		
		return template.query("select * from product", new RowMapper<Product>() {

			@Override
			public Product mapRow(ResultSet rs, int rowNum) throws SQLException {

				Product product=new Product();
				product.setProductId(rs.getInt(1));
				product.setProductName(rs.getString(2));
				product.setProductCost(rs.getInt(3));
				return product;
			}
		});
	}

	@Override
	public Product getProduct(int productId) {

		Product product=new Product();
		
		return template.queryForObject("select * from product where productId="+productId,new RowMapper<Product>() {

			@Override
			public Product mapRow(ResultSet rs, int rowNum) throws SQLException {

				product.setProductId(rs.getInt(1));
				product.setProductName(rs.getString(2));
				product.setProductCost(rs.getInt(3));
				return product;
			}
		});
		
	}

	

	
}
