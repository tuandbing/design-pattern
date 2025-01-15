package com.lottery.createtype.abstract_factory;

public class MandarinSubtitle implements Subtitle{
    @Override
    public void show() {
        System.out.println("正在显示中文字幕");
    }
}
