package com.muratArslan.shoppingApp.product.repository.mongo;

import com.muratArslan.shoppingApp.product.entity.Product;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

public interface ProductRepository extends ReactiveMongoRepository<Product, String> {
}
