package com.ticketmicroservice.ticketservices.repo;

import com.ticketmicroservice.ticketservices.model.TicketModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

public interface TicketRepo extends MongoRepository<TicketModel, String> {
}
