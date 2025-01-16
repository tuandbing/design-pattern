package com.lottery.structuretype.garnish;

public class FriedRice extends FastFood{
    public FriedRice() {
        super(10, "炒饭");
    }

    public double cost() {
        return getPrice();
    }
}
