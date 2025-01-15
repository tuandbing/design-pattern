package com.lottery.structuretype.adapter;

public class TCardImpl implements TFCard{
    @Override
    public String readTF() {
        System.out.println("read msg from tf card");
        return "msg from tf card";
    }

    @Override
    public void writeTF(String msg) {
        System.out.println("write msg to tf card: " + msg);
    }
}
