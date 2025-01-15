package com.lottery.createtype.singleton;

import com.sun.jdi.event.ThreadStartEvent;

public class Client {
    public static void main(String[] args) {
        Thread thread1 = new Thread(Client::test);
        Thread thread2 = new Thread(Client::test);
        Thread thread3 = new Thread(Client::test);
        thread1.start();
        thread2.start();
        thread3.start();
    }
    public static void test() {
        Singleton singleton = Singleton.getInstance();
//        ThreadSingleton singleton = ThreadSingleton.getInstance();
    }
}
