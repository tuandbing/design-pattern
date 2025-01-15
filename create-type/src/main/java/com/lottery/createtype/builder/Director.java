package com.lottery.createtype.builder;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Object construct() {
        builder.makeTitle("学生信息表");
        builder.makeItems(new Student[] {
                new Student("张三", "001", "1990-01-01"),
                new Student("李四", "002", "1991-02-02"),
                new Student("王五", "003", "1992-03-03"),
                new Student("赵六", "004", "1993-04-04")
        });
        return builder.getResult();
    }
}
