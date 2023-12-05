package com.muratArslan.shoppingApp.product.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CompanyDto {
    private String id;
    private String name;
}
