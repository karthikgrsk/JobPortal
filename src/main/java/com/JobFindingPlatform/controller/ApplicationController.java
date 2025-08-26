package com.JobFindingPlatform.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import lombok.RequiredArgsConstructor;
import java.util.*;
import com.JobFindingPlatform.dto.ApplicationsDTO;

@RestController
@RequestMapping("/applications")
@RequiredArgsConstructor
public class ApplicationController {

    private final ApplicationService applicationService;

    @PostMapping("/apply")
    public ResponseEntity<String>  apply(@ResponseBody ApplicationsDTO applicationsDTO) {
        applicationService.apply(applicationsDTO);
        return ResponseEntity.ok("Application submitted successfully");
    }

    @GetMapping("/jobseeker")
    public ResponseEntity<List<ApplicationsDTO>> getApplicationsByJobSeekerEmail(@RequestParam String email) {
        List<ApplicationsDTO> applications = applicationService.getApplicationsByJobSeekerEmail(email);
        return ResponseEntity.ok(applications);
    }

    @GetMapping("/recruiter")
    public ResponseEntity<List<ApplicationDTO>> getApplicationsByRecruiterEmail(@RequestParam String email) {
        List<ApplicationDTO> applications = applicationService.getApplicationsByRecruiterEmail(email);
        return ResponseEntity.ok(applications);     
    }

    @GetMapping("/jobtitle")
    public ResponseEntity<List<ApplicationsDTO>> getApplicationsByJobTitle(@RequestParam String title) {
        List<ApplicationsDTO> applications = applicationService.getApplicationsByJobTitle(title);
        return ResponseEntity.ok(applications); 
    }

    @GetMapping("/jobtype")
    public ResponseEntity<List<ApplicationsDTO>> getApplicationsByJobType(@RequestParam String type) {
        List<ApplicationsDTO> applications = applicationService.getApplicationsByJobType(type);
        return ResponseEntity.ok(applications);     
    }

    @PostMapping("/status")
    public ResponseEntity<String> updateApplicationStatus(@RequestParam Long applicationId, @RequestParam String status) {
        applicationService.updateApplicationStatus(applicationId, status);
        return ResponseEntity.ok("Application status updated successfully");
    }
}