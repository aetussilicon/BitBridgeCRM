package com.vanillaocde.bitbridge.crm.controllers;

import com.vanillaocde.bitbridge.crm.dtos.DTORegUser;
import com.vanillaocde.bitbridge.crm.model.Users;
import com.vanillaocde.bitbridge.crm.repositories.UserRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("auth/users")
public class UserController {

    @Autowired
    UserRepository repository;

    @PostMapping
    public void regUser(@RequestBody @Valid DTORegUser data){
        repository.save(new Users(data));
    }

}
