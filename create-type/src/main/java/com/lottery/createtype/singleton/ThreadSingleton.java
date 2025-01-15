package com.lottery.createtype.singleton;


import org.springframework.context.annotation.Bean;

public class ThreadSingleton {

    // 定义一个锁
    private static final Object lock = new Object();

    private static ThreadSingleton instance;

    private ThreadSingleton() {
    }

    public static ThreadSingleton getInstance() {
        if (instance == null) {
            synchronized (lock) {
                if (instance == null) {
                    try {
                        Thread.sleep(100);
                        instance = new ThreadSingleton();
                        System.out.println("Creating new ThreadSingleton.");
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }else {
                    System.out.println("ThreadSingleton already exists.");
                }
            }
        }
        return instance;

    }
}
