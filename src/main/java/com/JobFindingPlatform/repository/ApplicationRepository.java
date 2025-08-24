package com.JobFindingPlatform.repository;

import com.JobFindingPlatform.entity.Application;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

public interface ApplicationRepository extends JpaRepository<Application, Long>{
    Optional<Application> findByJobSeekerEmail(String jobSeekerEmail);
    Optional<Application> findByRecruiterEmail(String recruiterEmail);
    List<Application> findAllByJobId(Long jobId);
    List<Application> findAllByRecruiterEmail(String recruiterEmail);
}