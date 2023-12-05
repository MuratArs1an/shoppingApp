package com.muratArslan.shoppingApp.product.entity;

public class ProductImage {
    private ImageType imageType;
    private String url;

    enum ImageType{
        FEATURE,
        NORMAL
    }
}
