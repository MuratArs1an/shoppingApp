package com.muratArslan.shoppingApp.product.service;

import com.muratArslan.shoppingApp.product.dto.ProductDto;
import com.muratArslan.shoppingApp.product.dto.ProductSaveRequest;
import com.muratArslan.shoppingApp.product.repository.es.ProductEsRepository;
import com.muratArslan.shoppingApp.product.repository.mongo.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductEsRepository productEsRepository;
    private final ProductRepository productRepository;
    List<ProductDto> getByPaging(Pageable pageable){
        //1-Es den sorgula
        //2- Calc fielleri işle
        //3- redisten ihtiyac alanlarını getir
        //4-response nesnesini donustur
        return null;
    }
    ProductDto save(ProductSaveRequest productSaveRequest){
        //1- mongoya yaz
        //2-Es guncelle
        //3-Redisten guncelle
        //4-Es den cevap don
        //5- response nesnesine donustur
        return null;
    }
}
