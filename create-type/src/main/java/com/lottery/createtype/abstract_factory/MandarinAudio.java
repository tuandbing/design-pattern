package com.lottery.createtype.abstract_factory;

public class MandarinAudio implements Audio{
    @Override
    public void playback() {
        System.out.println("正在播放普通话音频");
    }
}
