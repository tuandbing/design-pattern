package com.lottery.behavior.strategy;

public class SalesMan {
    private Strategy strategy;

    public SalesMan(Strategy strategy){
        this.strategy = strategy;
    }

    public void sale() {
        strategy.show();
    }
}
