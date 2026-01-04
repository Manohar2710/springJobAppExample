package com.springJobAppExample.springJobAppExample.repos;

import com.springJobAppExample.springJobAppExample.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
    public User findUserByUsername(String name);
}
