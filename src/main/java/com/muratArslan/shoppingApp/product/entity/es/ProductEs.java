package com.muratArslan.shoppingApp.product.entity.es;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "product")
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class ProductEs {
    private String id;
    private String name;
    private String productCode;
    private String description;
    private CompanyEs seller;
    private String features;
    private boolean active;
    private CategoryEs category;
}
