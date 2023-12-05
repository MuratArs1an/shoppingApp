package com.muratArslan.shoppingApp.product.dto;

import com.muratArslan.shoppingApp.product.entity.MoneyType;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class ProductDto {
    private String id;
    private String image;
    private String name;
    private String description;
    private CompanyDto seller;
    private String features;
    private int available;
    private boolean freeDelivery;
    private String deliveryIn;
    private BigDecimal price;
    private String categoryId;
    private MoneyType moneyType;
}
