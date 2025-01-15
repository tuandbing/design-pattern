package com.lottery.structuretype.adapter;

public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        SDCard sdCard = new SDCardImpl();
        System.out.println(computer.readSD(sdCard));

        System.out.println("------------");

        SDAdapterTF adapter = new SDAdapterTF();
        System.out.println(computer.readSD(adapter));

        // 更建议用下面的对象适配器模式
        System.out.println("------------");
        SDObjectAdapterTF objectAdapterTF = new SDObjectAdapterTF(new TCardImpl());
        System.out.println(computer.readSD(objectAdapterTF));
    }
}
