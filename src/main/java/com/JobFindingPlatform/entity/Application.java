package com.JobFindingPlatform.entity;
import lombok.AllArgsConstructor;
import lombok.Data;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="applications")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Application{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
}