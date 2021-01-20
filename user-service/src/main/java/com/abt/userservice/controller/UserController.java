package com.abt.userservice.controller;

import com.abt.userservice.dto.ResponseTemplateDTO;
import com.abt.userservice.entity.User;
import com.abt.userservice.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user){
        log.info("Inside saveUser Controller method");
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public ResponseTemplateDTO userDetails(@PathVariable("id") Long userId){
        return userService.userDetails(userId);
    }
}
