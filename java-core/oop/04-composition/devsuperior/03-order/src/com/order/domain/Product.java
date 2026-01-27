package com.order.domain;

public class Product {

    private final String name;
    private final Long price;

    public Product(String name, double price) {
        this.name = name;
        this.price = (long) (price *1000);
    }

    public String getName() {
        return name;
    }
}
