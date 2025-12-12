package com.springJobAppExample.springJobAppExample.controller;

import com.springJobAppExample.springJobAppExample.model.JobPost;
import com.springJobAppExample.springJobAppExample.service.JobPostingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class JobPostingController {

    @Autowired
    JobPostingService jobPostingService;


    @GetMapping("jobs")
    public List<JobPost> getAllJobs(){
        return jobPostingService.getAllJobs();
    }
    @GetMapping("jobPost/{postId}")
    public JobPost getJobPost(@PathVariable("postId") int jobPostId) {
        return jobPostingService.getJob(jobPostId);
    }

    @PostMapping("jobPost")
    public JobPost saveJobPost(@RequestBody JobPost jobPost) {
        return jobPostingService.saveJobPost(jobPost);
    }
    @PutMapping("jobPost")
    public JobPost updateJobPost(@RequestBody JobPost jobPost) {
        jobPostingService.updateJobPost(jobPost);
        return jobPostingService.getJob(jobPost.getId());
    }

    @DeleteMapping("jobPost")
    public void deleteJobPost(@RequestBody JobPost jobPost) {
        jobPostingService.deleteJobPost(jobPost);
    }
    @GetMapping("jobPost/search")

    public List<JobPost> searchBy(@RequestParam("keyword") String s){
        return jobPostingService.searchBy(s);
    }

    @GetMapping("loadData")
    public String loadData() {
        return jobPostingService.loadData();
    }
}
