package com.example.shuttleapi.Repositories;

import com.example.shuttleapi.Models.Tickets;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends MongoRepository<Tickets, String>
{
    
}
