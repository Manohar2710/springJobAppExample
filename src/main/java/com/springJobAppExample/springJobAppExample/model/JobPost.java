package com.springJobAppExample.springJobAppExample.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Entity
@Scope("prototype")
public class JobPost {
    public JobPost(int id, String title, String experience, String location, String company) {
        this.id = id;
        this.title = title;
        this.experience = experience;
        this.location = location;
        this.company = company;
    }

    @Id
    int id;
    String title;
    String experience;
    String location;

    public JobPost() {

    }


    @Override
    public String toString() {
        return "JobPost{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", experience='" + experience + '\'' +
                ", location='" + location + '\'' +
                ", company='" + company + '\'' +
                '}';
    }

    String company;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }


}
