package com.immutableStock.domain;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String name;
    private long money;
    private List<Transaction> transactionsList;
    private AuditLogHistory auditLogHistory;

    public User(String name, long money, AuditLogHistory auditLogHistory) {
        this.name = name;
        this.money = money*1000L;
        this.transactionsList = new ArrayList<>();
        this.auditLogHistory = auditLogHistory;
    }

    List<Transaction> getRealTransactionsList() {
        return transactionsList;
    }

    AuditLogHistory getRealAuditLogHistory() {
        return auditLogHistory;
    }

    void registerTransactionsList(Transaction transaction) {
        transactionsList.add(transaction);
    }
    void registerAuditLogHistory(AuditLog auditLog) {
        auditLogHistory.add(auditLog);
    }


    public List<Transaction> getTransactionsList() {
        return List.copyOf(this.transactionsList);
    }

    public long getMoney() {
        return money;
    }
    public void takeMoney(long money) {
        this.money -= money;
    }
    public void addMoney(long money) {
        this.money += money;
    }
}
