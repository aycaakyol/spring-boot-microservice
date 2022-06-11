package com.aa.microservice.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aa.microservice.product.model.Product;

public interface IProductRepository extends JpaRepository<Product, Long> {
    
}
