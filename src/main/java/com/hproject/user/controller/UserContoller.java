package com.hproject.user.controller;

import com.hproject.user.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/test")
public class UserContoller {

    @GetMapping("/permit-all")
    public User testUser(){
        return new User();
    }


}
