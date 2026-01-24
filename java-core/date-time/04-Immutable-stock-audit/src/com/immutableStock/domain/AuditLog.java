package com.immutableStock.domain;

import java.time.LocalDateTime;

public class AuditLog {

    private final Transaction transaction;
    private final User actor;
    private final LocalDateTime occurredAt;
    private AuditLogHistory auditLogHistory;

    public AuditLog(Transaction transaction, User actor) {
        this.transaction =  transaction;
        this.actor = actor;
        this.occurredAt = LocalDateTime.now();
    }

    public AuditLog(Transaction transaction, User actor, LocalDateTime occurredAt) {
        this.transaction =  transaction;
        this.actor = actor;
        this.occurredAt = occurredAt;
    }

    public LocalDateTime getOccurredAt() {
        return occurredAt;
    }
}
