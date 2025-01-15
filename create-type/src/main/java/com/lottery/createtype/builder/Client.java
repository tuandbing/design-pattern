package com.lottery.createtype.builder;

public class Client {
    public static void main(String[] args) {

        Director director = new Director(new HTMLBuilder());
        String result = director.construct().toString();
        System.out.println(result);

        System.out.println("==================================");
        director = new Director(new TextBuilder());
        result = director.construct().toString();
        System.out.println(result);
    }
}
