package com.lottery.email.controller;

import com.lottery.email.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    @Autowired
    private EmailService emailService;

    @GetMapping("/send-email")
    public String sendEmail() {
        emailService.sendSimpleEmail("17305285876@163.com", "测试邮件", "这是一封测试邮件！");
        return "邮件发送成功！";
    }
}
