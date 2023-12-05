package com.muratArslan.shoppingApp.product.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.List;

@Document(collection = "product")
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Product {
    private String id;
    private String name;
    private String productCode;
    private String description;
    private String companyId;
    private String features;
    private boolean active;
    private String categoryId;
    private List<ProductImage> productImages;

}

/*        { document -ES
                'image': 'https://productimages.hepsiburada.net/s/32/500/10352568139826.jpg',
                'name': 'Awesome Product 1',
                'description': 'Product featured description',
                'seller': -document -ES
                'features': html document -ES
                'available': kalan adet, redis and document
                'freeDelivery': true, -service /if price>50
                'deliveryIn': 'In 3 days', -calc util
                'price':120,
                'category': -document
                'money':'$' -enum
                },
*/