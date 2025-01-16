package com.lottery.structuretype.garnish;

public abstract class FastFood {

    private double price;
    private String desc;

    public FastFood(double price, String desc){
        this.price = price;
        this.desc = desc;
    }
    public FastFood(){

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public abstract double cost();  // 获取价格
}
