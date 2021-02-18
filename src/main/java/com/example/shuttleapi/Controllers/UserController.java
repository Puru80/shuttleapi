package com.example.shuttleapi.Controllers;

import com.example.shuttleapi.Models.User;
import com.example.shuttleapi.Repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController 
{
    @Autowired
    private UserRepository userRepo;

    @PostMapping(path = "/register")
    @ResponseStatus(code = HttpStatus.CREATED)
    public User saveUser(@RequestBody User user)
    {
        return userRepo.save(user);
    }

}
