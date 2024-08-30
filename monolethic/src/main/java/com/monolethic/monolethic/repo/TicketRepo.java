package com.monolethic.monolethic.repo;

import com.monolethic.monolethic.model.TicketModel;
import com.monolethic.monolethic.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepo extends JpaRepository<TicketModel, String> {
    //create custom crud method


}
