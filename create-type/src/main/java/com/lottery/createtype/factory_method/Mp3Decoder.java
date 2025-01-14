package com.lottery.createtype.factory_method;

public class Mp3Decoder implements Decoder{
    @Override
    public void decode(String fileName) {
        System.out.println("Decoding mp3 file: " + fileName);
    }
}
