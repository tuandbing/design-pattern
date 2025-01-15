package com.lottery.createtype.prototype;

public class Client {
    public static void main(String[] args) {
        ApplicationLetter letter1 = new ApplicationLetter();
        letter1.subject = "I am applying for a position";
        letter1.mailAddress = "1234 Main Street";
        letter1.salutation = "Dear Hiring Manager,";
        letter1.positionApplied = "Software Engineer";
        letter1.personalExperience = "I have been working as a software engineer for 5 years.";
        letter1.signature = "Sincerely,";
        letter1.send();

        // 创建第二封信, 显式调用clone方法
        ApplicationLetter letter2 = (ApplicationLetter) letter1.clone();
        letter2.mailAddress = "5678 Other Street";
        letter2.send();

        // 创建第三封信, 显式调用新的Duplicate方法
        ApplicationLetter letter3 = (ApplicationLetter) duplicate(letter1);
        letter3.mailAddress = "9012 Another Street";
        letter3.send();

    }

    public static Object duplicate(ICloneable proto) {
        return proto.clone();
    }
}
