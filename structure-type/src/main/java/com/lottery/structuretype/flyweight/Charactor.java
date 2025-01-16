package com.lottery.structuretype.flyweight;

public abstract class Charactor {
    protected char _symbol;
    protected int _width;
    protected int _height;
    protected int _ascent;
    protected int _descent;

    abstract void Display(int pointSize);
}
