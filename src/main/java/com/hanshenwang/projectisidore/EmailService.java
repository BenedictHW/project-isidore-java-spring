package com.hanshenwang.projectisidore;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    private JavaMailSender javaMailSender;

    public EmailService(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    public void sendMail(String toEmail, String subject, String message, String name) {

        var mailMessage = new SimpleMailMessage();

        name = name.concat(" : ");
        name = name.concat(message);

        mailMessage.setTo(toEmail);
        mailMessage.setSubject(subject);
        mailMessage.setText(name);
        //Even if sender address is victortang3002, the setFrom field cannot be empty
        mailMessage.setFrom("johndoe@example.com");

        javaMailSender.send(mailMessage);
    }
}
