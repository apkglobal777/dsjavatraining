package com.monolethic.monolethic.controller;


import com.monolethic.monolethic.model.TicketModel;
import com.monolethic.monolethic.model.UserModel;
import com.monolethic.monolethic.services.TicketServices;
import com.monolethic.monolethic.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tickets")
public class TicketController {
    @Autowired
    private TicketServices services;

    //create user
    @PostMapping()
    public TicketModel addTicket(@RequestBody TicketModel ticketModel)
    {
        return services.createTicket(ticketModel);
    }


    //get All users
    @GetMapping()
    public List<TicketModel> getAllTickets()
    {
        return services.getAllTickets();
    }

    //get user by id
    @GetMapping(value = "/{ticketId}")
    public TicketModel getTicketById(@PathVariable("ticketId") @RequestBody String ticketId)
    {
        return services.getTicketById(ticketId);
    }
}
