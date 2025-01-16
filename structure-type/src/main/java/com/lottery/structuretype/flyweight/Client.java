package com.lottery.structuretype.flyweight;

public class Client {
    public static void main(String[] args) {
        CharactorFactory factory = new CharactorFactory();

        CharactorA ca = (CharactorA)factory.GetCharactor("A");
        ca.Display(12);

        CharactorB cb = (CharactorB)factory.GetCharactor("B");
        cb.Display(10);

        CharactorC cc = (CharactorC)factory.GetCharactor("C");
        cc.Display(14);
    }
}
