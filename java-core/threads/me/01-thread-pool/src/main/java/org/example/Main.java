package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

public class Main {

    static void main(String[] args) {

        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);

        System.out.println(executor.getPoolSize());
        System.out.println(executor.getQueue().size());

        for (int i = 0; i < 5; i++) {
            submitTask(executor);
        }
        System.out.println("=====");
        System.out.println(executor.getPoolSize());
        System.out.println(executor.getQueue().size());
    }

    public static void submitTask(ThreadPoolExecutor executor) {
        executor.submit(() -> {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName());
            return null;
        });
    }
}