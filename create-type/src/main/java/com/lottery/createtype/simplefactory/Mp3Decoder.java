package com.lottery.createtype.simplefactory;

public class Mp3Decoder implements Decoder{
    @Override
    public void decode(String fileName) {
        System.out.println("decode mp3 file: " + fileName);
    }
}
