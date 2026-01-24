package com.immutableStock.domain;

import java.time.LocalDateTime;

public class TransactionService {

    public static void buy (User user, String stock, double unitPrice, int unitsBought) {
        Transaction transaction;
        if (user.getMoney() >= unitPrice*unitsBought*1000) {
            user.takeMoney((long) (unitPrice*unitsBought*1000L));
            transaction = new Transaction(user, stock, (long) (unitPrice*1000L), unitsBought, true,true);
        } else {
            transaction = new Transaction(user, stock, (long) (unitPrice*1000L), unitsBought, true,false);
        }
        user.registerTransactionsList(transaction);

        AuditLog auditLog = new AuditLog(transaction, user);
        user.registerAuditLogHistory(auditLog);
    }
    public static void buy (User user, String stock, double unitPrice, int unitsBought, LocalDateTime dateTime) {
        Transaction transaction;
        if (user.getMoney() >= unitPrice*unitsBought*1000) {
            user.takeMoney((long) (unitPrice*unitsBought*1000L));
            transaction = new Transaction(user, stock, (long) (unitPrice*1000L), unitsBought, true,true);
        } else {
            transaction = new Transaction(user, stock, (long) (unitPrice*1000L), unitsBought, true,false);
        }
        user.registerTransactionsList(transaction);

        AuditLog auditLog = new AuditLog(transaction, user);
        user.registerAuditLogHistory(auditLog);
    }

    public static void sell (User user, String stock, double unitPrice, int unitsSold) {
        user.addMoney ((long) (unitPrice*unitsSold*1000L));
        Transaction transaction = new Transaction(user, stock, (long) (unitPrice*1000L), unitsSold, false, true);
        user.registerTransactionsList(transaction);

        AuditLog auditLog = new AuditLog(transaction, user);
        user.registerAuditLogHistory(auditLog);
    }
    public static void sell (User user, String stock, double unitPrice, int unitsSold, LocalDateTime dateTime) {
        user.addMoney((long) (unitPrice*unitsSold*1000L));
        Transaction transaction = new Transaction(user, stock, (long) (unitPrice*1000L), unitsSold, false, true);
        user.registerTransactionsList(transaction);

        AuditLog auditLog = new AuditLog(transaction, user);
        user.registerAuditLogHistory(auditLog);
    }
}
