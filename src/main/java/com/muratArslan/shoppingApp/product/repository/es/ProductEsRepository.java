package com.muratArslan.shoppingApp.product.repository.es;

import com.muratArslan.shoppingApp.product.entity.es.ProductEs;
import org.springframework.data.elasticsearch.repository.ReactiveElasticsearchRepository;


public interface ProductEsRepository extends ReactiveElasticsearchRepository<ProductEs,String> {
}
