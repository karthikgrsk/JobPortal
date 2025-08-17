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

    private final AuthService AuthService;

    @PostMapping("/register")
    public ResponseEntity<AuthResponseDTO> register(@RequestBody UserDTO userDTO) {
        AuthResponseDTO response = AuthService.register(userDTO);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginRequestDTO loginRequestDTO) {
        String token = AuthService.login(loginRequestDTO);
        return ResponseEntity.ok(token);
    }

}



