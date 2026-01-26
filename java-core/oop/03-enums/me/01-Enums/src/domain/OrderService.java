package domain;

import java.util.List;

public class OrderService {

    private OrderHistory history;

    public OrderService() {
        history = new OrderHistory();
    }

    public List<Order> getCurrentOrders() {
        return history.getCurrentOrders();
    }
    public List<List> getOrdersHistory() {
        return history.getOrdersHistory();
    }

    public void createOrder(Client client, Food food, int units) {
        Order order = new Order(client, food, units);
        history.addOrders(order, (units*Order.longprices(food)));
    }

    public Order createOrder(Client client, Food food, int units, boolean delivery) {
        Order order = new Order(client, food, units, delivery);


        history.addOrders(order, ((units*Order.longprices(food))+order.deliveryPrice));
        return order;
    }

    public void setStatus(Order order, Status status) {
        order.setStatus(status);

        if (status == Status.END || status == Status.DELIVERED) {
            this.history.orderFinished(order);
        }
    }
}
