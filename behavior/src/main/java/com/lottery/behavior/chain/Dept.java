package com.lottery.behavior.chain;

public abstract class Dept {
    protected String name;
    public Dept(String name) {
        this.name = name;
    }

    public abstract Boolean handle(LeaveRequest leave);
}
