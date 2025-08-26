package com.JobFindingPlatform.service;

import com.JobFindingPlatform.entity.Application;
import com.JobFindingPlatform.dto.ApplicationsDTO;
import com.JobFindingPlatform.repository.ApplicationRepository;
import org.springframework.stereotype.Service;
import java.util.*;
import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class ApplicationService{
    private final ApplicationRepository applicationRepository;

    public String apply(ApplicationsDTO applicationsDTO){
        Application application = new Application();

        app.setJobId(dto.getJobId());
		app.setJobSeekerName(dto.getJobseekerName());
		app.setJobSeekerEmail(dto.getJobSeekerEmail());
		app.setJobTitle(dto.getJobTitle());
		app.setJobType(dto.getJobType());
		app.setRecruiterEmail(dto.getRecruiterEmail());
		app.setStatus(dto.getStatus());
		app.setAppliedAt(dto.getAppliedAt());
		
		appRepo.save(app);
        return "Applied Successfully";
    }

    public List<ApplicationsDTO> getApplicationsByJobSeekerEmail(String email) {
        List<Application> applications = applicationRepository.findByJobSeekerEmail(email);
        List<ApplicationsDTO> applicationsDTO = new ArrayList<>();
        for (Application app : applications) {
            applicationsDTO.add(mapToDTO(app)); 
        }
        return applicationsDTO;
    }

    public List<ApplicationsDTO> getRecruiterEmail(String email) {
        List<Application> applications = applicationRepository.findByRecruiterEmail(email);
        List<ApplicationsDTO> applicationsDTO = new ArrayList<>();
        for (Application app : applications) {
            applicationsDTO.add(mapToDTO(app)); 
        }
        return applicationsDTO;
    }
    public List<ApplicationsDTO> getJobTitle(String title) {
        List<Application> applications = applicationRepository.findByJobTitle(title);
        List<ApplicationsDTO> applicationsDTO = new ArrayList<>();
        for (Application app : applications) {
            applicationsDTO.add(mapToDTO(app)); 
        }
        return applicationsDTO;
    }

    public List<ApplicationsDTO> getJobType(String type) {
        List<Application> applications = applicationRepository.findByJobType(type);
        List<ApplicationsDTO> applicationsDTO = new ArrayList<>();
        for (Application app : applications) {
            applicationsDTO.add(mapToDTO(app)); 
        }
        return applicationsDTO;
    }

    public void updateApplicationStatus(Long applicationId, String status) {
        Application app = applicationRepository.findById(applicationId)
                .orElseThrow(() -> new RuntimeException("Application not found with id: " + applicationId));
        app.setStatus(status);
        applicationRepository.save(app);
    }


    private ApplicationsDTO mapToDTO(Application app) {
		
		ApplicationsDTO dto = new ApplicationsDTO();
		dto.setJobId(app.getJobId());
		dto.setJobSeekerEmail(app.getJobSeekerEmail());
		dto.setJobseekerName(app.getJobSeekerName());
		dto.setRecruiterEmail(app.getRecruiterEmail());
		dto.setJobType(app.getJobType());
		dto.setJobTitle(app.getJobTitle());
		dto.setAppliedAt(app.getAppliedAt());
		dto.setStatus(app.getStatus());
		
		return dto;
	}
    

}