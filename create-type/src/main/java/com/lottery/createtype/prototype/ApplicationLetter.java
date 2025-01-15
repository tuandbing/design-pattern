package com.lottery.createtype.prototype;

import java.text.DateFormat;
import java.util.Date;

public class ApplicationLetter implements ICloneable{

    public String subject = "";
    public String mailAddress = "";
    public String salutation = "";
    public String positionApplied = "";
    public String personalExperience = "";
    public String signature = "";

    public Date now = new Date();
    public DateFormat d = DateFormat.getDateInstance();

    public void send() {
        System.out.println("Sending letter to " + mailAddress);
        System.out.println("Subject: " + subject);
        System.out.println("Date: " + d.format(now));
        System.out.println("Salutation: " + salutation);
        System.out.println("Position applied: " + positionApplied);
        System.out.println("Personal experience: " + personalExperience);
        System.out.println("Signature: " + signature);
        System.out.println("---------------------------------------------");
    }

    @Override
    public Object clone() {
        ApplicationLetter letter = new ApplicationLetter();
        letter.subject = this.subject;
        letter.mailAddress = this.mailAddress;
        letter.salutation = this.salutation;
        letter.positionApplied = this.positionApplied;
        letter.personalExperience = this.personalExperience;
        letter.signature = this.signature;
        return letter;
    }
}
