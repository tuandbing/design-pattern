package com.lottery.structuretype.combination;

public class ImageFile extends File{
    public ImageFile(String name) {
        super(name);
    }

    @Override
    void add(File file) {
        System.out.println(name + "不支持添加");
    }

    @Override
    void remove(File file) {
        System.out.println(name + "不支持删除");
    }

    @Override
    File getChild(int index) {
        System.out.println(name + "不支持获取子文件");
        return null;
    }

    @Override
    void killVirus() {
        System.out.println("对图像文件" + name + "进行杀毒");
    }
}
