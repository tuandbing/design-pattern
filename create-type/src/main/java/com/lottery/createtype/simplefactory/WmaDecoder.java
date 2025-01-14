package com.lottery.createtype.simplefactory;

public class WmaDecoder implements Decoder{
    @Override
    public void decode(String fileName) {
        System.out.println("WMA解码: " + fileName);
    }
}
