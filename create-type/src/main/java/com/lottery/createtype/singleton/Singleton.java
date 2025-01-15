package com.lottery.createtype.singleton;

import org.springframework.context.annotation.Bean;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {

        // 这种方式是线程不安全的
        if (instance == null) {
            System.out.println("Creating new Singleton.");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            instance = new Singleton();
        }else {
            System.out.println("Singleton already exists.");
        }
        return instance;
    }
}
