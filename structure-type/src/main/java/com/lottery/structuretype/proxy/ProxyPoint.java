package com.lottery.structuretype.proxy;

// 静态代理
public class ProxyPoint implements SellTickets{

    private TrainStation ts = new TrainStation();
    @Override
    public void sell() {
        System.out.println("代理点收取费用");
        ts.sell();
    }
}
