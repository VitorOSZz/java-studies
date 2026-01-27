package com.order.app;

import com.order.domain.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=Enter client data:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        String birthDateString = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Client client = new Client(name, email, LocalDate.parse(birthDateString, formatter));

        System.out.println();
        System.out.println("=Enter order data:");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(scanner.nextLine().toUpperCase().trim());
        System.out.print("How many items to this order: ");
        Order order = new Order(status);

        int manyItems = scanner.nextInt();
        for (int i = 0; i < manyItems; i++) {
            System.out.println("-Enter #" +(i+1) + " item data:");
            System.out.print("Product name: ");
            scanner.nextLine();
            String productName = scanner.nextLine();
            System.out.print("Product price: ");
            double productPrice = scanner.nextDouble();
            System.out.print("Quantity: ");
            int productQuantity = scanner.nextInt();

            Product product = new Product(productName, productPrice);
            order.addItem(new OrderItem(product, productPrice, productQuantity));
        }
        System.out.println();
        System.out.println("ORDER SUMMARY: ");
        System.out.println("Order moment: " + order.getStatus().toString().toLowerCase());
        System.out.println("Client: " + client);
        System.out.println("Order items:");
        for (OrderItem orderitem : order.getOrderItemList()) {
            System.out.println(orderitem);
        }
        System.out.println("Total price: $" + (order.getTotal()/1000.00));
    }
}