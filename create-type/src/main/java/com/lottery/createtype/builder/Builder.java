package com.lottery.createtype.builder;

public interface Builder {
    void makeTitle(String title);
    void makeItems(Student[] items);
    Object getResult();
}
