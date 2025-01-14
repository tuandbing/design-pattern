package com.lottery.createtype.factory_method;

public class SimplePlayer {
    public static void main(String[] args) {
        String fileName = "Santorini.mp3";
        // String fileName = "Nightingale.wma";
        Factory factory = new Mp3DecoderFactory();
        Decoder player = factory.createDecoder();
        player.decode(fileName);
    }
}
