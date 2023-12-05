package com.muratArslan.shoppingApp.product.repository.mongo;

import com.muratArslan.shoppingApp.product.entity.ProductPrice;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ProductPriceRepository extends ReactiveMongoRepository<ProductPrice, String>{
}
