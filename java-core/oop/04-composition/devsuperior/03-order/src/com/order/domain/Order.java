package com.order.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private LocalDateTime date;
    private OrderStatus status;
    private List<OrderItem> orderItemList;

    public Order(OrderStatus status) {
        this.status = status;
        this.date = LocalDateTime.now();
        this.orderItemList = new ArrayList<>();
    }

    public void addItem(OrderItem item) {
        orderItemList.add(item);
    }
    public void removeItem(OrderItem item) {
        orderItemList.remove(item);
    }

    public long getTotal() {
        long total = 0;

        for (OrderItem item : orderItemList) {
            total += item.subTotal();
        }

        return total;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public List<OrderItem> getOrderItemList() {
        return List.copyOf(this.orderItemList);
    }
}
