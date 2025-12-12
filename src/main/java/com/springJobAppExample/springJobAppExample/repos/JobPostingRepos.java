package com.springJobAppExample.springJobAppExample.repos;

import com.springJobAppExample.springJobAppExample.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public interface JobPostingRepos extends JpaRepository<JobPost, Integer> {
    public List<JobPost> findByTitleContainingIgnoreCaseOrLocationContainingIgnoreCase(String s1, String s2);

//    public List<JobPost> getAllJobs() {
//        return jobPostList;
//    }
//
//    public JobPost getJob(int jobId) {
//        JobPost job = null;
//        for(JobPost jobpost: jobPostList) {
//            if(jobpost.getId() == jobId){
//                job = jobpost;
//            }
//         }
//        return job;
//    }
//
//    public JobPost saveJobPost(JobPost jobPost) {
//        jobPostList.add(jobPost);
//        return jobPost;
//    }
//
//    public JobPost updateJobPost(JobPost jobPost) {
//        jobPostList.forEach(jobPost1 -> {
//            if(jobPost1.getId() == jobPost.getId()) {
//                jobPost1.setCompany(jobPost.getCompany());
//                jobPost1.setExperience(jobPost.getExperience());
//                jobPost1.setLocation(jobPost.getLocation());
//                jobPost1.setTitle(jobPost.getTitle());
//            }
//        });
//        return jobPost;
//    }

//    public void deleteJobPost(JobPost jobPost) {
//        for (JobPost jobPost1 : jobPostList) {
//            if (jobPost1.getId() == jobPost.getId()) {
//                jobPostList.remove(jobPost1);
//            }
//        }
//    }



//    public List<JobPost> findByTitle()
}
