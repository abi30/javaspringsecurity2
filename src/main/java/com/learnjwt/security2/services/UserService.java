package com.learnjwt.security2.services;


import com.learnjwt.security2.models.ApplicationUser;
import com.learnjwt.security2.models.Role;
import com.learnjwt.security2.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserService implements UserDetailsService {
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        System.out.println("In the user Details Service :"+username);
        return  userRepository.findByUsername(username).orElseThrow(()-> new UsernameNotFoundException("user is not valid"));

    }
}
