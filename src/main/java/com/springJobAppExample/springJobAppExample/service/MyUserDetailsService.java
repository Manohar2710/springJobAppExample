package com.springJobAppExample.springJobAppExample.service;


import com.springJobAppExample.springJobAppExample.model.User;
import com.springJobAppExample.springJobAppExample.model.UserPrinciples;
import com.springJobAppExample.springJobAppExample.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService
{
    @Autowired
    UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepo.findUserByUsername(username);
        if( user == null ) {
            System.out.println("User not found");
            throw new UsernameNotFoundException("User not found");
        }
        UserPrinciples userPrinciples = new UserPrinciples(user);
        return userPrinciples;
    }
}
