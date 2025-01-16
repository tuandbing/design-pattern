package com.lottery.behavior.template;

public class Client {
    public static void main(String[] args) {
        Thread thread1 = new Thread(Client::run);
        Thread thread2 = new Thread(Client::run);
        thread1.start();
        thread2.start();
    }

    public static void run() {

        System.out.println(Thread.currentThread().getName() + " is running...");

        //炒手撕包菜
        ConcreteClass_BaoCai baoCai = new ConcreteClass_BaoCai();
        baoCai.cookProcess();

        //炒蒜蓉菜心
        ConcreteClass_CaiXin caiXin = new ConcreteClass_CaiXin();
        caiXin.cookProcess();
    }
}
