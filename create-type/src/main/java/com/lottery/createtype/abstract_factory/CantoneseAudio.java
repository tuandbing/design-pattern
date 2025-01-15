package com.lottery.createtype.abstract_factory;

public class CantoneseAudio implements Audio{
    @Override
    public void playback() {
        System.out.println("正在播放粤语音频");
    }
}
