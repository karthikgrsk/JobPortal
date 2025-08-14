package com.JobFindingPlatform.controller;

import com.JobFindingPlatform.service.AuthService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class JobPortalController {

    private AuthService AuthService;

    @GetMapping("/register")
    public String register() {
        return "registered";
    }

    @PostMapping("login")
    public String login(){
        return "logged in";
    }


}
