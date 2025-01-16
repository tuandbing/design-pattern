package com.lottery.structuretype.bridging;

public class AVIFile implements VideoFile{
    @Override
    public void decode(String fileName) {
        System.out.println("decode avi file: " + fileName);
    }
}
