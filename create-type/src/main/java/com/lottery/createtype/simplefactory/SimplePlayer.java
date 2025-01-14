package com.lottery.createtype.simplefactory;

public class SimplePlayer {
    public static void main(String[] args) {
//        String fileName = "Santorini.mp3";
        String fileName = "Nightingale.wma";
        Decoder player = DecoderFactory.createDecoder(fileName);
        player.decode(fileName);
    }
}
