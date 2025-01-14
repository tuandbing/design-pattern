package com.lottery.createtype.simplefactory;

public class DecoderFactory {
    public static Decoder createDecoder(String fileName) {
        switch (fileName.substring(fileName.lastIndexOf(".") + 1)) {
            case "mp3":
                return new Mp3Decoder();
            case "wma":
                return new WmaDecoder();
            default:
                return null;
        }
    }
}
