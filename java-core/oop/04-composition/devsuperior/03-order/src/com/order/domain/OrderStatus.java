package com.order.domain;

public enum OrderStatus {
    PENDING_PAYMENT(0),
    PROCESSING(1),
    SHIPPED(2),
    DELIVERED(3);

    private int id;

    OrderStatus(int id) {
        this.id = id;
    }
}
