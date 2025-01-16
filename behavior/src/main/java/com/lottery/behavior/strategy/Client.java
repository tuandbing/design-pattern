package com.lottery.behavior.strategy;

public class Client {
    public static void main(String[] args) {
        SalesMan salesMan = new SalesMan(new StrategyA());
        salesMan.sale();

        salesMan = new SalesMan(new StrategyB());
        salesMan.sale();

        salesMan = new SalesMan(new StrategyC());
        salesMan.sale();
    }
}
