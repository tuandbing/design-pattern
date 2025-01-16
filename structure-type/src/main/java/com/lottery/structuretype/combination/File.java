package com.lottery.structuretype.combination;

public abstract class File {
    String name;
    abstract void add(File file);
    abstract void remove(File file);
    abstract File getChild(int index);
    abstract void killVirus();
    public File(String name) {
        this.name = name;
    }
}
