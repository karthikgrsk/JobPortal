package com.JobFindingPlatform.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="applications")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Application{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private Long jobPostId;
    private Long jobSeekerId;
    private String status;
    private LocalDateTime appliedAt;
}