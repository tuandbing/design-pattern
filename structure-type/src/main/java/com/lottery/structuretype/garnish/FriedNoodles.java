package com.lottery.structuretype.garnish;

public class FriedNoodles extends FastFood{
    public FriedNoodles() {
        super(12, "炒面");
    }

    @Override
    public double cost() {
        return getPrice();
    }
}
