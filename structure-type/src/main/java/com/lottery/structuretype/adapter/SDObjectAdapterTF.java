package com.lottery.structuretype.adapter;

public class SDObjectAdapterTF implements SDCard{

    private TFCard tfCard;

    public SDObjectAdapterTF(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public String readSD() {
        System.out.println("object adapter read tf card ");
        return tfCard.readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("object adapter write tf card");
        tfCard.writeTF(msg);
    }
}
