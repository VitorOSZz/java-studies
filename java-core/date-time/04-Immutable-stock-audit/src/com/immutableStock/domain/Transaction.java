package com.immutableStock.domain;

public class Transaction {

    private final User user;
    private final String stock;
    private final long stockUnitPrice;
    private final int stockUnits;
    private final boolean buyOrSell; // true == buy | false == sell
    private final boolean tradeRealized;

    public Transaction(User user, String stock, long stockUnitPrice, int stockUnits, boolean buyOrSell, boolean tradeRealized) {
        this.user = user;
        this.stock = stock;
        this.stockUnitPrice = stockUnitPrice;
        this.stockUnits = stockUnits;
        this.buyOrSell = buyOrSell;
        this.tradeRealized = tradeRealized;
    }
}
