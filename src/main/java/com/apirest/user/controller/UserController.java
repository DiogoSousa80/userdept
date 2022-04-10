package com.apirest.user.controller;

import com.apirest.user.repository.UserRepository;
import com.apirest.userdept.etities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/users")

public class UserController {

    @Autowired
    private UserRepository repository;
    @GetMapping
    public List<User> finfAll(){
        List<User> result = repository.findAll();
        return result;
    }
        


}
