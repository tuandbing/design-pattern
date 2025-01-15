package com.lottery.structuretype.adapter;

public class SDCardImpl implements SDCard{

    @Override
    public String readSD() {
        System.out.println("read msg from sd card");
        return "sd card read msg";
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("write msg to sd card:" + msg);
    }
}
