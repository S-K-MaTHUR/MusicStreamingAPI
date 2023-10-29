package com.example.MusicStreaming.API.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SignUpInput {


    private String fullName;

    private String email;

    private String userPassword;

    private String phoneNumber;
}
