package com.immutableStock.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class AuditLogHistory {

    private List<AuditLog> auditLogs;

    public AuditLogHistory() {
        this.auditLogs = new ArrayList<>();
    }

     public void add(AuditLog auditLog) {
        this.auditLogs.add(auditLog);
    }

    public List<AuditLog> getAuditLogs() {
        return List.copyOf(auditLogs);
    }

    public List<AuditLog> findBetween(LocalDateTime startedDate, LocalDateTime endDate) {
        List<AuditLog> auditsFound = new ArrayList<>();

        for (AuditLog auditLog : getAuditLogs()) {
            if (auditLog.getOccurredAt().isAfter(startedDate) && auditLog.getOccurredAt().isBefore(endDate)) {
                auditsFound.add(auditLog);
            }
        }

        return auditsFound;
    }
}
