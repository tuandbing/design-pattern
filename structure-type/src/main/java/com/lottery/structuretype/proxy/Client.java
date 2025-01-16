package com.lottery.structuretype.proxy;

public class Client {
    public static void main(String[] args) {


        TrainStation trainStation = new TrainStation();
        trainStation.sell();

        // 静态代理
        ProxyPoint proxyPoint = new ProxyPoint();
        proxyPoint.sell();

        // JDK动态代理
        ProxyFactory proxyFactory = new ProxyFactory();
        SellTickets proxyObject = proxyFactory.getProxyObject();
        proxyObject.sell();

        // CGLIB动态代理
        CGLIBProxyFactory cglibProxyFactory = new CGLIBProxyFactory();
        TrainStation proxyObject2 = cglibProxyFactory.getProxyObject();
        proxyObject2.sell();
    }
}
