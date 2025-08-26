package com.JobFindingPlatform.service;

import org.springframework.stereotype.Service;
import com.JobFindingPlatform.dto.EmailRequestDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.JavaMailSender;
import java.util.Properties;

@Service
@RequiredArgsConstructor
public class EmailService {
    private final JavaEmailSender mailSender;


    @Value("${spring.mail.username}")
    private final String from;
    

    public void sendEmail(String to, String subject, String body) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(from);
        message.setTo(to);
        message.setSubject(subject);
        message.setText(body);
        mailSender.send(message);
    }

}