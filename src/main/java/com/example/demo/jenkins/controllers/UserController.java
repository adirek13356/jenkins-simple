package com.example.demo.jenkins.controllers;

import com.example.demo.jenkins.entitys.UserEntity;
import com.example.demo.jenkins.repositorys.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping(value = "/v1/user")
    public ResponseEntity userController() {
        System.out.println("userController");

        List<UserEntity> userEntity = userRepository.findAll();

        return ResponseEntity.ok(userEntity);
    }
}
