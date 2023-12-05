package com.muratArslan.shoppingApp.product.entity;

import lombok.Data;

@Data
public class ProductImage {
    private ImageType imageType;
    private String url;

    public enum ImageType{
        FEATURE,
        NORMAL
    }
}
