package com.order.domain;

public class OrderItem {

    private Product product;
    private long price;
    private int quantity;

    public OrderItem(Product product, double price, int quantity) {
        this.product = product;
        this.price = (long) (price*1000);
        this.quantity = quantity;
    }

    public long subTotal() {
        return this.price * this.quantity;
    }

    @Override
    public String toString() {
        return this.product.getName() + ", $" + (this.price/1000.00) + ", Quantity: " + this.quantity + ", Subtotal: " + (this.subTotal()/1000.00);
    }
}
