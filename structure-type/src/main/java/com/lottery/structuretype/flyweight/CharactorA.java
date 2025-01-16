package com.lottery.structuretype.flyweight;

public class CharactorA extends Charactor{

    public CharactorA(){
        this._symbol = 'A';
        this._height = 100;
        this._width = 120;
        this._ascent = 70;
        this._descent = 0;
    }
    @Override
    void Display(int pointSize) {
        System.out.println(this._symbol + " " + pointSize);
    }
}
