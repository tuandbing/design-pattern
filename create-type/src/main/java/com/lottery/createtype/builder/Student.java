package com.lottery.createtype.builder;

public class Student {

    private String name;

    private String number;

    private String birth;

    public Student(String name, String number, String birth) {
        this.name = name;
        this.number = number;
        this.birth = birth;
    }

    public String getName() {
        return name;
    }
    public String getNumber() {
        return number;
    }
    public String getBirth() {
        return birth;
    }
}
