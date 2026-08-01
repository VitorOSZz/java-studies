package org.example;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(2);
        submitTask(scheduler, 3, "Joao Gomes");
        submitTask(scheduler, 3, "Manuel Gomes");
        submitTask(scheduler, 5, "Ketchup Gomes");
        submitTask(scheduler, 5, "Shopping Gomes");
        submitTask(scheduler, 4, "dooontt be a ratttttt");
        submitTask(scheduler, 6, "Daniel Barbosa");

        System.out.println("Main Sleeping");
        Thread.sleep(5000);
        System.out.println("Main wake up");
        submitTask(scheduler, 5, "Batman");
        submitTask(scheduler, 5, "Batman");
        submitTask(scheduler, 5, "Batman");
        submitTask(scheduler, 2, "Mulher Maravilha");


        scheduler.shutdown(); // close to this code don't run infinitely
    }

    public static void submitTask(ScheduledExecutorService scheduler, int delay, String text) {
        scheduler.schedule(() -> {
            System.out.println(text + " A task executed.");
        }, delay, TimeUnit.SECONDS);
    }
}