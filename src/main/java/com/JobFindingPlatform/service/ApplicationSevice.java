package com.JobFindingPlatform.service;

import com.JobFindingPlatform.entity.Application;
import com.JobFindingPlatform.dto.ApplicationsDTO;
import com.JobFindingPlatform.repository.ApplicationRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ApplicationService{
    private final ApplicationRepository applicationRepository;
}