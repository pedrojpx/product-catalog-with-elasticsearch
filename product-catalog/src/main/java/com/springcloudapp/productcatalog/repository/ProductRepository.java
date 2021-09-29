package com.springcloudapp.productcatalog.repository;

import org.springframework.data.repository.CrudRepository;

import com.springcloudapp.productcatalog.model.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
