package com.lottery.createtype.factory_method;

public class Mp3DecoderFactory implements Factory{
    @Override
    public Decoder createDecoder() {
        return new Mp3Decoder();
    }
}
