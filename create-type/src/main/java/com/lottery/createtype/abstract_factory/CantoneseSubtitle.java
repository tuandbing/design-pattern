package com.lottery.createtype.abstract_factory;

public class CantoneseSubtitle implements Subtitle{
    @Override
    public void show() {
        System.out.println("正在播放粤语字幕");
    }
}
