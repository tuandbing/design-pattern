package com.lottery.createtype.no_design_pattern;

public class SimplePlayer {
    public static void main(String[] args) {
        String fileName = "Santorini.mp3";
        // String fileName = "Nightingale.wma";

        Mp3Decoder decoder = new Mp3Decoder();
        decoder.decode();

//        WmaDecoder wmaDecoder = new WmaDecoder();
//        wmaDecoder.decode();
    }
}
