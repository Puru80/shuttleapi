package com.example.shuttleapi.Repositories;

import com.example.shuttleapi.Models.User;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> 
{
    
}
