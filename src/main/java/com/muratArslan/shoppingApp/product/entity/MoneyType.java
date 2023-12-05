package com.muratArslan.shoppingApp.product.entity;

public enum MoneyType {
    USD("Dolar","$"),
    EURO("Euro","E"),
    TL("Türk Lirası", "T");

    private String label; //dolar
    private String symbol; //$

    MoneyType(String label, String symbol) {
        this.label = label;
        this.symbol = symbol;
    }
}
