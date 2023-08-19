package com.learnjwt.security2.models;


import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class LoginResponseDTO {
    private ApplicationUser user;
    private String jwt;

}