package com.aa.microservice.product.service;

import com.aa.microservice.product.model.Product;

public interface IProductService {

    void deleteProduct(Long productId);

    Object saveProduct(Product product);

    Object findAllProducts();
    
}
