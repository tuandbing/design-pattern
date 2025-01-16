package com.lottery.structuretype.combination;

import java.util.ArrayList;
import java.util.List;

public class Folder extends File{

    private List<File> fileList = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    @Override
    void add(File file) {
        fileList.add(file);
    }

    @Override
    void remove(File file) {
        fileList.remove(file);
    }

    @Override
    File getChild(int index) {
        return fileList.get(index);
    }

    @Override
    void killVirus() {
        System.out.println("文件夹：" + name + "杀毒");
        for (File file : fileList) {
            file.killVirus();
        }
    }
}
