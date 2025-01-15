package com.lottery.createtype.builder;

public class HTMLBuilder implements Builder{

    private StringBuilder stringBuilder = new StringBuilder();

    @Override
    public void makeTitle(String title) {
        stringBuilder.append("<html><head><title>" + title + "</title></head><body>");
        stringBuilder.append("<h1>" + title + "</h1>");
    }

    @Override
    public void makeItems(Student[] items) {
        for (Student item : items) {
            stringBuilder.append("<ul>");
            stringBuilder.append("<li>").append(item.getName()).append("</li>");
            stringBuilder.append("<li>").append(item.getNumber()).append("</li>");
            stringBuilder.append("<li>").append(item.getBirth()).append("</li>");
            stringBuilder.append("</ul>");
        }
    }

    @Override
    public Object getResult() {
        stringBuilder.append("</body></html>");
        return stringBuilder;
    }
}
