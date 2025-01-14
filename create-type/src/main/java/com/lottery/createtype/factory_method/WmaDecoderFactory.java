package com.lottery.createtype.factory_method;

public class WmaDecoderFactory implements Factory{

    @Override
    public Decoder createDecoder() {
        return new WmaDecoder();
    }
}
