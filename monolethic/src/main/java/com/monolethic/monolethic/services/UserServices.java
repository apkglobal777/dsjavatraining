package com.monolethic.monolethic.services;

import com.monolethic.monolethic.model.UserModel;
import com.monolethic.monolethic.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServices {
    @Autowired
    private UserRepo repo;

    //create user
    public UserModel createUser(UserModel model){
        String userid = UUID.randomUUID().toString();
        model.setUserId(userid);
        return repo.save(model);
    }

    //get user by id
    public UserModel getUserById(String userId){
      return repo.findById(userId).get();
    }

    //get all users
    public List<UserModel> getAllUsers()
    {
        return repo.findAll();
    }
}


