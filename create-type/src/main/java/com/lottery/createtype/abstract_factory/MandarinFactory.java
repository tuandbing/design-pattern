package com.lottery.createtype.abstract_factory;

public class MandarinFactory implements AbstractFactory{
    @Override
    public Audio createAudio() {
        return new MandarinAudio();
    }

    @Override
    public Subtitle createSubtitle() {
        return new MandarinSubtitle();
    }
}
