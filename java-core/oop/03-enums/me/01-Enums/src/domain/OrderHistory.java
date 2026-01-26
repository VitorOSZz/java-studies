package domain;

import java.util.ArrayList;
import java.util.List;

public class OrderHistory {

    private List<List> ordersHistory;
    private List<Order> ordersHistoryOrders;
    private List<Long> ordersHistoryTotalMoney;

    private List<Order> orders;
    private List<Long> totalMoney;

    public OrderHistory() {
        ordersHistory = new ArrayList<>();
        ordersHistoryOrders = new ArrayList<>();
        ordersHistoryTotalMoney = new ArrayList<>();

        ordersHistory.add(ordersHistoryOrders);
        ordersHistory.add(ordersHistoryTotalMoney);

        orders = new ArrayList<>();
        totalMoney = new ArrayList<>();
    }

    void addOrders(Order order, long totalMoney) {
        this.orders.add(order);
        this.totalMoney.add(totalMoney);
    }

    void orderFinished(Order order) {
        this.orders.remove(order);
        this.totalMoney.remove(order.getTotalMoney());

        this.ordersHistoryOrders.add(order);
        this.ordersHistoryTotalMoney.add(order.getTotalMoney());
    }

    List<Order> getCurrentOrders() {
        return List.copyOf(orders);
    }

    public List<List> getOrdersHistory() {
        return List.copyOf(ordersHistory);
    }
}
