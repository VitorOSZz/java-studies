package com.immutableStock.app;

import com.immutableStock.domain.AuditLog;
import com.immutableStock.domain.AuditLogHistory;
import com.immutableStock.domain.TransactionService;
import com.immutableStock.domain.User;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        AuditLogHistory auditLogHistory = new AuditLogHistory();

        User vitor = new User("Vitor",100, auditLogHistory);
        TransactionService.buy(vitor, "BBAS3", 24.28, 1);

        LocalDateTime dateTime1 = LocalDateTime.now().minusDays(26).minusMinutes(20);
        TransactionService.buy(vitor, "BBAS3", 24.28, 1, dateTime1);

        LocalDateTime dateTime2 = LocalDateTime.now().minusDays(44).minusMinutes(31);
        TransactionService.buy(vitor, "BBAS3", 24.28, 1, dateTime2);

        System.out.println(vitor.getTransactionsList());
        System.out.println(vitor.getMoney()/1000.0);
        LocalDateTime dateTime3 = LocalDateTime.now().minusDays(104).plusMinutes(44);
        TransactionService.buy(vitor, "BBAS3", 24.28, 1, dateTime3);
        TransactionService.sell(vitor, "BBAS3", 25, 1, dateTime3);
        TransactionService.sell(vitor, "BBAS3", 25, 1, dateTime3);

        System.out.println(vitor.getTransactionsList());
        System.out.println(vitor.getMoney()/1000.0);
        System.out.println(auditLogHistory.getAuditLogs());

        for (AuditLog auditLog : auditLogHistory.getAuditLogs()) {
            System.out.println(auditLog.getOccurredAt());
        }

        TransactionService.buy(vitor, "BBAS3", 24.28, 1);

        LocalDateTime startedDate = LocalDateTime.now().minusDays(30);
        LocalDateTime endDate = LocalDateTime.now();
        System.out.println(auditLogHistory.findBetween(startedDate, endDate));
    }
}