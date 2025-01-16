package com.lottery.structuretype.combination;

public class TextFile extends File{
    public TextFile(String name) {
        super(name);
    }

    @Override
    public void add(File file) {
        System.out.println(name + "暂不支持该方法");
    }

    @Override
    public void remove(File file) {
        System.out.println(name + "暂不支持该方法");
    }

    @Override
    public File getChild(int index) {
        System.out.println(name + "暂不支持该方法");
        return null;
    }

    @Override
    public void killVirus() {
        System.out.println("对文本文件" + name + "进行杀毒");
    }
}
