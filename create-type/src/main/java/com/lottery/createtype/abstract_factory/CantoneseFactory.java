package com.lottery.createtype.abstract_factory;

public class CantoneseFactory implements AbstractFactory{
    @Override
    public Audio createAudio() {
        return new CantoneseAudio();
    }

    @Override
    public Subtitle createSubtitle() {
        return new CantoneseSubtitle();
    }
}
