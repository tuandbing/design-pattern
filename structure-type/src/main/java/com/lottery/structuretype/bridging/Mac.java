package com.lottery.structuretype.bridging;

public class Mac extends OperatingSystemVersion{

    public Mac(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        System.out.println("in mac");
        videoFile.decode(fileName);
    }
}
