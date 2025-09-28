package com.JobFindingPlatform.controller;

import com.JobFindingPlatform.dto.AuthResponseDTO;
import com.JobFindingPlatform.dto.LoginRequestDTO;
import com.JobFindingPlatform.dto.UserDTO;
import com.JobFindingPlatform.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class UserController {

    private final AuthService authService;
    
    @GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }
    
    
    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody UserDTO userDTO) {
        String response = authService.register(userDTO);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponseDTO> login(@RequestBody LoginRequestDTO loginRequestDTO) {
        AuthResponseDTO token = authService.login(loginRequestDTO);
        return ResponseEntity.ok(token);
    }

}



