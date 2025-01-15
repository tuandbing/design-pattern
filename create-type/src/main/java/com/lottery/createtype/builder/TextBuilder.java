package com.lottery.createtype.builder;

public class TextBuilder implements Builder{

    private StringBuilder stringBuilder = new StringBuilder();
    @Override
    public void makeTitle(String title) {
        stringBuilder.append("======================\n");
        stringBuilder.append("[").append(title).append("]\n");
        stringBuilder.append("\n");
    }

    @Override
    public void makeItems(Student[] items) {
        for (Student item : items) {
            stringBuilder.append("* ").append(item.getName()).append(" ").append(item.getNumber()).append(" ").append(item.getBirth()).append("\n");
        }
    }

    @Override
    public Object getResult() {
        stringBuilder.append("======================\n");
        return stringBuilder;
    }
}
