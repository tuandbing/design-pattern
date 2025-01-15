package com.lottery.structuretype.adapter;

public class Computer {
    public String readSD(SDCard sdCard) {
        if (sdCard == null) {
            throw new NullPointerException("sdCard is not null");
        }
        return sdCard.readSD();
    }
}
