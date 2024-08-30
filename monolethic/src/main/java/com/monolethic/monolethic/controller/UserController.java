package com.monolethic.monolethic.controller;


import com.monolethic.monolethic.model.UserModel;
import com.monolethic.monolethic.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserServices services;

    //create user
    @PostMapping()
    public UserModel addUser(@RequestBody UserModel userModel)
    {
        return services.createUser(userModel);
    }


    //get All users
    @GetMapping()
    public List<UserModel> getAllUsers()
    {
        return services.getAllUsers();
    }

    //get user by id
    @GetMapping(value = "/{userId}")
    public UserModel getUserById(@PathVariable("userId") @RequestBody String userId)
    {
        return services.getUserById(userId);
    }
}
