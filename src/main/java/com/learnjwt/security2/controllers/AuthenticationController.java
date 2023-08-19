package com.learnjwt.security2.controllers;

import com.learnjwt.security2.models.ApplicationUser;
import com.learnjwt.security2.models.LoginResponseDTO;
import com.learnjwt.security2.models.RegistrationDTO;
import com.learnjwt.security2.services.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@CrossOrigin("*")
public class AuthenticationController {

    @Autowired
    private AuthenticationService authenticationService;

//    @Autowired
//    private RegistrationDTO registrationDTO;
    @PostMapping("/register")
    public ApplicationUser registerUser(@RequestBody RegistrationDTO registrationDTO){

        return authenticationService.registerUser(registrationDTO.getUsername(), registrationDTO.getPassword());
    }

    @PostMapping("/login")
    public LoginResponseDTO loginUser(@RequestBody RegistrationDTO body){

        return authenticationService.loginUser(body.getUsername(), body.getPassword());
    }
}
