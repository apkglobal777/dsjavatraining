package com.monolethic.monolethic.repo;

import com.monolethic.monolethic.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<UserModel, String> {
    //create custom crud method


}
