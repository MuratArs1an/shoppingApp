package com.muratArslan.shoppingApp.product.service;

import org.springframework.stereotype.Service;

@Service
public class ImageService {
    public String getProductMainImage(String productId){
        return "https://productimages.hepsiburada.net/s/32/500/10352568139826.jpg";
    }
}
