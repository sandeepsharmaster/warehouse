package com.warehouse.auth.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.warehouse.auth.model.Product;

public interface NewProductRepository { //extends Repository<Product, Integer> {

	void delete(Product deleted);

	List<Product> findAll();

	Product findOne(Long id);

	Product save(Product persisted);
}
