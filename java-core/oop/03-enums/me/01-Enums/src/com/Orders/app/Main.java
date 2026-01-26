package com.Orders.app;
import domain.*;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Client vitor = new Client("Vitor");
        OrderService resturant = new OrderService();
        Order parmigianaBeefOrder = resturant.createOrder(vitor, Food.PARMIGIANA_BEEF, 1, true);
        Order parmigianaChickenOrder = resturant.createOrder(vitor, Food.PARMIGIANA_CHICKEN, 1, true);

        resturant.setStatus(parmigianaBeefOrder, Status.STARTED);
        System.out.println("Parmigiana Beef Order: " + parmigianaBeefOrder.getStatus());
        System.out.println("Parmigiana Chicken Order: " + parmigianaChickenOrder.getStatus());
        System.out.println();

        resturant.setStatus(parmigianaChickenOrder, Status.STARTED);
        resturant.setStatus(parmigianaBeefOrder, Status.END);
        System.out.println("Parmigiana Beef Order: " + parmigianaBeefOrder.getStatus());
        System.out.println("Parmigiana Chicken Order: " + parmigianaChickenOrder.getStatus());
        System.out.println();

        resturant.setStatus(parmigianaChickenOrder, Status.DELIVERED);
        resturant.setStatus(parmigianaBeefOrder, Status.DELIVERED);
        System.out.println("Parmigiana Beef Order: " + parmigianaBeefOrder.getStatus());
        System.out.println("Parmigiana Chicken Order: " + parmigianaChickenOrder.getStatus());

        System.out.println();
        System.out.println(resturant.getOrdersHistory());

        List<Order> copyOfOrders = resturant.getOrdersHistory().get(0);
        List<Long> copyOfTotalMoney = resturant.getOrdersHistory().get(1);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("uuuu-MM-dd HH:mm:ss");
        for (int i = 0; i < copyOfOrders.size(); i++) {
            System.out.println(copyOfOrders.get(i).getClient());
            System.out.println(copyOfOrders.get(i).getFood());
            System.out.println(copyOfOrders.get(i).getUnits());
            System.out.println(copyOfOrders.get(i).getUnitPrice());
            System.out.println(formatter.format(LocalDateTime.ofInstant(copyOfOrders.get(i).getOrderCreatedAt(), ZoneId.systemDefault())));
            System.out.println("=".repeat(7));
            System.out.println("Result:");
            System.out.println(copyOfTotalMoney.get(i)/1000.00);
    }
        }
}