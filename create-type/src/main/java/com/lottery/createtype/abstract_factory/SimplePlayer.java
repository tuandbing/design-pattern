package com.lottery.createtype.abstract_factory;

public class SimplePlayer {
    public static void main(String[] args) {
        // 创建一个能生成普通话音频和普通话字母的工厂类对象
//        AbstractFactory factory = new MandarinFactory();

        AbstractFactory factory = new CantoneseFactory();

        // 生成音频类产品, 实际生产出什么产品由工厂类对象所限定
        Audio audio = factory.createAudio();
        // 生成字幕类产品, 实际生产出什么产品由工厂类对象所限定
        Subtitle subtitle = factory.createSubtitle();
        audio.playback();
        subtitle.show();
    }
}
