package com.worker.domain;

import java.time.LocalDate;

public class HourContract {

    private final LocalDate date;
    private final long valuePerHour;
    private final int hours;

    public HourContract(LocalDate date, int hours, long valuePerHour) {
        this.date = date;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }

    public long getTotalValue() {
        return valuePerHour*hours;
    }

    public LocalDate getDate() {
        return date;
    }
}
