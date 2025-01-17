package com.lottery.email.service;

public interface EmailService {
    void sendSimpleEmail(String to, String subject, String text);
}
