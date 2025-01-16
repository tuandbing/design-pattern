package com.lottery.structuretype.bridging;

public class Windows extends OperatingSystemVersion{
    public Windows(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        System.out.println("in windows");
        videoFile.decode(fileName);
    }
}
