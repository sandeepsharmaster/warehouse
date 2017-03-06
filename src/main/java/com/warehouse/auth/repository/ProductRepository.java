package com.warehouse.auth.repository;

import org.springframework.data.repository.CrudRepository;

import com.warehouse.auth.model.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>{
	
	
}
