package com.learnjwt.security2.models;


import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder

public class RegistrationDTO {

    private String username;
    private String password;

}
