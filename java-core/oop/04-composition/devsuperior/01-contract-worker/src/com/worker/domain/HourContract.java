package com.worker.domain;

import java.time.Instant;

public class HourContract {

    private final Instant date;
    private final long valuePerHour;
    private final int hours;

    public HourContract(Instant date, int hours, long valuePerHour) {
        this.date = date;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }

    public long getTotalValue() {
        return valuePerHour*hours;
    }

    public Instant getDate() {
        return date;
    }
}
