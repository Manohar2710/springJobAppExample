package com.springJobAppExample.springJobAppExample.service;

import com.springJobAppExample.springJobAppExample.model.JobPost;
import com.springJobAppExample.springJobAppExample.repos.JobPostingRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class JobPostingService {
    @Autowired
    JobPostingRepos jobPostingRepos;

    public List<JobPost> getAllJobs(){
        return jobPostingRepos.findAll();

    }

    public JobPost getJob(int jobPostId) {
        return  jobPostingRepos.findById(jobPostId).orElse(new JobPost());
    }

    public JobPost saveJobPost(JobPost jobPost) {
        return jobPostingRepos.save(jobPost);
    }

    public JobPost updateJobPost(JobPost jobPost) {
        return jobPostingRepos.save(jobPost);
    }

    public void deleteJobPost(JobPost jobPost) {
        jobPostingRepos.delete(jobPost);
    }
    public List<JobPost> searchBy(String s) {
        List<JobPost> jobs = jobPostingRepos.findByTitleContainingIgnoreCaseOrLocationContainingIgnoreCase(s, s);
        return !jobs.isEmpty() ? jobs : List.of();
    }
    public String loadData() {
        List<JobPost> jobPostList = new ArrayList<>(Arrays.asList(
                new JobPost(  1,
                        "Frontend Developer",
                        "TechNova Solutions",
                        "Bangalore, India",
                        "3-5 years"  ),
                new JobPost(  2,
                        "Backend Engineer",
                        "InnoSoft Labs",
                        "Hyderabad, India",
                        "4-6 years"  ),
                new JobPost(  3,
                        "Full Stack Developer",
                        "CloudEdge Systems",
                        "Pune, India",
                        "5-7 years"  ),
                new JobPost(  4,
                        "Data Analyst",
                        "FinPoint Analytics",
                        "Mumbai, India",
                        "2-4 years"  ),
                new JobPost(  5,
                        "DevOps Engineer",
                        "NextGen Networks",
                        "Chennai, India",
                        "3-5 years"  )
        ));
        jobPostingRepos.saveAll(jobPostList);
        return "success";
    }

//    public List<JobPost> searchBy(String s) {
////        return jobPostingRepos;
//    }
//    public void loadData() {
//
//
//    }
}
