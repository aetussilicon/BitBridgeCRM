package com.vanillaocde.bitbridge.crm.controllers;

import  com.vanillaocde.bitbridge.crm.dtos.DTORegUser;
import com.vanillaocde.bitbridge.crm.model.Users;
import com.vanillaocde.bitbridge.crm.repositories.UserRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("auth")
public class UserController {

    @Autowired
    UserRepository repository;

    //Register new User
    @PostMapping
    @RequestMapping("/register")
    public ResponseEntity regUser(@RequestBody @Valid DTORegUser data){
        repository.save(new Users(data));
        return ResponseEntity.ok().build();
    }

    public ResponseEntity<Users> updateUser(@PathVariable String gsid, @RequestBody @Valid DTOUpdateUser data) {
        repository.updateData(data);
    }

}
