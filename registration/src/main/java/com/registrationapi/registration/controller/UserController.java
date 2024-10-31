package com.registrationapi.registration.controller;

import com.registrationapi.registration.model.UserEntity;
import com.registrationapi.registration.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<UserEntity> registerUser(@RequestBody UserEntity user) {
        UserEntity registeredUser = userService.registerUser(user);
        return ResponseEntity.ok(registeredUser);
    }


}