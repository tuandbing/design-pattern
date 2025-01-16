package com.lottery.structuretype.bridging;

public class Client {
    public static void main(String[] args) {
        OperatingSystemVersion mac = new Windows(new AVIFile());
        mac.play("AVIFile");
    }
}
