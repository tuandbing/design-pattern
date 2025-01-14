package com.lottery.createtype.factory_method;

public class WmaDecoder implements Decoder{
    @Override
    public void decode(String fileName) {
        System.out.println("Decoding WMA file: " + fileName);
    }
}
