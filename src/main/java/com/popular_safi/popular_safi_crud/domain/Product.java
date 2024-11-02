package com.popular_safi.popular_safi_crud.domain;

public class Product {

    private int productId;
    private String name;
    private String code;
    private Double price;
    private int stock;

    public int getProductId() {
        return this.productId;
    }
    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return this.code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public Double getPrice() {
        return this.price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }

    public int getStock() {
        return this.stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }

}
