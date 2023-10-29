package com.example.MusicStreaming.API.controller;

import com.example.MusicStreaming.API.dto.SignInInput;
import com.example.MusicStreaming.API.models.User;
import com.example.MusicStreaming.API.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/signup")
    public String signUp(@RequestBody User user){
        return userService.signUp(user);
    }
    @PostMapping("/signIn")
    public String signIn(@RequestBody SignInInput signInInput){
        return userService.signIn(signInInput);
    }

}
