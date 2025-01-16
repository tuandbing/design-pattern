package com.lottery.structuretype.combination;

public class Client {
    public static void main(String[] args) {
        Folder folder1,folder2,folder3;
        folder1 = new Folder("Sunny的资料");
        folder2 = new Folder("图像文件");
        folder3 = new Folder("文本文件");

        ImageFile image1,image2;
        image1 = new ImageFile("小龙女.jpg");
        image2 = new ImageFile("张无忌.gif");

        TextFile text1,text2;
        text1 = new TextFile("九阴真经.txt");
        text2 = new TextFile("葵花宝典.doc");

        folder2.add(image1);
        folder2.add(image2);
        folder3.add(text1);
        folder3.add(text2);
        folder1.add(folder2);
        folder1.add(folder3);

        folder1.killVirus();
    }
}
