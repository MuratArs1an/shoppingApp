package com.muratArslan.shoppingApp.product.repository;

import com.muratArslan.shoppingApp.product.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
