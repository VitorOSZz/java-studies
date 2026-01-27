# Enums

## What is an Enum
An enum is a constant class and is commonly used for things like statuses and categories.

## How to create an Enum
An enum is a class and is initialized like this:

public enum EnumName {
    ITEM_1,
    ITEM_2,
    ITEM_3,
    ITEM_4
}

Note: The first letter of the enum name is uppercase by convention, and the enum constants should be written in uppercase.

## Advanced Enums
An enum is a class, so it can have a constructor.
This is useful for cases like:

{ SIMPLE_HAMBURGER(30.99), BACON_HAMBURGER(36.99), BACON_EGG_HAMBURGER(37.99) }

## How to create a constructor

public enum OrderStatus {
    PENDING_PAYMENT(0),
    PROCESSING(1),
    SHIPPED(2),
    DELIVERED(3);

    private int statusId;

    OrderStatus(int statusId) {
        this.statusId = statusId;
    }
}

Inside the parentheses, you pass the values(arguments), and then you create the constructor just like in a normal class.
