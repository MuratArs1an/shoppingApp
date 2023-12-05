package com.muratArslan.shoppingApp.product.service;

import com.muratArslan.shoppingApp.product.entity.MoneyType;
import com.muratArslan.shoppingApp.product.repository.mongo.ProductPriceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
@Service
@RequiredArgsConstructor
public class ProductPriceService {
    private ProductPriceRepository productPriceRepository;
    public BigDecimal getByMoneyType(String id, MoneyType moneyType){
        return BigDecimal.TEN;
    }
}
