package com.muratArslan.shoppingApp.product.service;

import com.muratArslan.shoppingApp.product.dto.CompanyDto;
import com.muratArslan.shoppingApp.product.dto.ProductDto;
import com.muratArslan.shoppingApp.product.dto.ProductSaveRequest;
import com.muratArslan.shoppingApp.product.entity.MoneyType;
import com.muratArslan.shoppingApp.product.entity.es.ProductEs;
import com.muratArslan.shoppingApp.product.repository.es.ProductEsRepository;
import com.muratArslan.shoppingApp.product.repository.mongo.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductEsRepository productEsRepository;
    private final ProductRepository productRepository;
    private final ProductPriceService productPriceService;
    private final ProductDeliveryService productDeliveryService;
    private final ProductAmountService productAmountService;
    private final ImageService imageService;
    public Flux<ProductDto> getAll(){
        return productEsRepository.findAll().map(this::mapToDto);
    }

    //aldığı elastic search nesnesini dto ya donütürecek
    //2- Calc fieldleri işle
    //3- redisten ihtiyac alanlarını getir
    //4-response nesnesini donustur
    private ProductDto mapToDto(ProductEs productEs) {
        BigDecimal productPrice=productPriceService.getByMoneyType(productEs.getId(), MoneyType.USD);
        return ProductDto.builder()
                .price(productPrice)
                .name(productEs.getName())
                .features(productEs.getFeatures())
                .id(productEs.getId())
                .description(productEs.getDescription())
                .deliveryIn(productDeliveryService.getDeliveryInfo(productEs.getId()))
                .categoryId(productEs.getCategory().getId())
                .available(productAmountService.getByProductId(productEs.getId()))
                .freeDelivery(productDeliveryService.isDeliveryFree(productEs.getId(), productPrice))
                .moneyType(MoneyType.USD)
                .image(imageService.getProductMainImage(productEs.getId()))
                .seller(CompanyDto.builder().id(productEs.getSeller().getId())
                        .name(productEs.getSeller().getName()).build())
                .build();

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
