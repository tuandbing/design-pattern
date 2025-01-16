package com.lottery.structuretype.bridging;

public class REVBBFile implements VideoFile{
    @Override
    public void decode(String fileName) {
        System.out.println("REVBBFile decode: " + fileName);
    }
}
